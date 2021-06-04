package org.dryun.domain.api.WechatApi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.digest.DigestUtils;
import org.dryun.domain.entity.WechatUser;
import org.dryun.domain.service.WechatUserService;
import org.dryun.jwt.JwtUtil;
import org.dryun.untils.Result;
import org.dryun.untils.UUIDUtils;
import org.dryun.untils.WechatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("wx/wechatUser")
public class WechatUserApi {

    @Autowired
    private WechatUserService wechatUserService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Result userLogin(@RequestParam(value = "code", required = false) String code,
                             @RequestParam(value = "rawData", required = false) String rawData,
                             @RequestParam(value = "signature", required = false) String signature,
                             @RequestParam(value = "encrypteData", required = false) String encrypteData,
                             @RequestParam(value = "iv", required = false) String iv) {

        // 用户非敏感信息：rawData
        // 签名：signature
        JSONObject rawDataJson = JSON.parseObject(rawData);
        // 1.接收小程序发送的code
        // 2.开发者服务器 登录凭证校验接口 appi + appsecret + code
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(code);
        // 3.接收微信接口服务 获取返回的参数
        String openId = SessionKeyOpenId.getString("openid");
        String sessionKey = SessionKeyOpenId.getString("session_key");

        System.err.println(rawDataJson);

        // 4.校验签名 小程序发送的签名signature与服务器端生成的签名signature2 = sha1(rawData + sessionKey)
        String signature2 = DigestUtils.sha1Hex(rawData + sessionKey);
        if (!signature.equals(signature2)) {
            return new Result().build(500,"签名校验失败");
        }
        // 5.根据返回的User实体类，判断用户是否是新用户，是的话，将用户信息存到数据库；不是的话，更新最新登录时间
        WechatUser user = wechatUserService.selectUserByOpenId(openId);
        // uuid生成唯一key，用于维护微信小程序用户与服务端的会话
        String skey = UUIDUtils.getUUID();
        WechatUser wechatUser = new WechatUser();
        if (user == null) {
            // 用户信息入库
            String nickName = rawDataJson.getString("nickName");
            String avatarUrl = rawDataJson.getString("avatarUrl");
            String gender = rawDataJson.getString("gender");
            String city = rawDataJson.getString("city");
            String country = rawDataJson.getString("country");
            String province = rawDataJson.getString("province");


            wechatUser.setOpenId(openId);
            wechatUser.setSkey(skey);
            wechatUser.setCreateTime(new Date());
            wechatUser.setLastVisitTime(new Date());
            wechatUser.setSessionKey(sessionKey);
            wechatUser.setCity(city);
            wechatUser.setProvince(province);
            wechatUser.setCountry(country);
            wechatUser.setAvatarUrl(avatarUrl);
            wechatUser.setGender(Integer.parseInt(gender));
            wechatUser.setNickName(nickName);

            wechatUserService.addWechatUser(wechatUser);
        } else {

            wechatUser.setOpenId(openId);
            // 已存在，更新用户登录时间
            wechatUser.setLastVisitTime(new Date());
            // 重新设置会话skey
            wechatUser.setSkey(skey);
            wechatUserService.updateUserByOpenId(wechatUser);
        }
        //encrypteData比rowData多了appid和openid
        //JSONObject userInfo = WechatUtil.getUserInfo(encrypteData, sessionKey, iv);
        //6. 把新的skey返回给小程序
        String token = JwtUtil.sign(openId, sessionKey);
        return new Result().build(200,"微信授权登陆成功",token);
    }


}
