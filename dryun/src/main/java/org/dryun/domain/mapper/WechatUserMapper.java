package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.WechatUser;

@Mapper
public interface WechatUserMapper {

    //添加微信用户
    Integer addWechatUser(WechatUser wechatUser);

    //根据openid查询微信用户
    WechatUser selectUserByOpenId(String openId);

    //更新用户登陆时间
    Integer updateUserByOpenId(WechatUser wechatUser);

}
