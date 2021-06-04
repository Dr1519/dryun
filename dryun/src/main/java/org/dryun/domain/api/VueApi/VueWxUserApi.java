package org.dryun.domain.api.VueApi;

import org.dryun.domain.service.WechatUserService;
import org.dryun.untils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api/wechatUser")
public class VueWxUserApi {
    @Autowired
    private WechatUserService wechatUserService;

    @RequestMapping(value = "/getWxUserList",method = RequestMethod.POST)
    @ResponseBody
    public Result getWxUserList(@RequestParam(value = "pageNo", required = false)Integer pageNo,
                                @RequestParam(value = "pageSize", required = false)Integer pageSize){
        List<List<?>> lists = wechatUserService.queryWechatUserPage(pageNo, pageSize);
        List<?> wxUserList = lists.get(0);
        Integer count = (Integer) lists.get(1).get(0);
        return new Result().build(200,"用户数据获取成功",count,wxUserList);

    }
}
