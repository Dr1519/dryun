package org.dryun.domain.service;

import org.dryun.domain.entity.WechatUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WechatUserService {

    //添加微信用户
    Integer addWechatUser(WechatUser wechatUser);

    //根据openid查询微信用户
    WechatUser selectUserByOpenId(String openId);

    //更新用户登陆时间
    Integer updateUserByOpenId(WechatUser wechatUser);

    //所有用户
    List<List<?>> queryWechatUserPage(Integer pageNo, Integer pageSize);
}
