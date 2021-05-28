package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.WechatUser;
import org.dryun.domain.mapper.WechatUserMapper;
import org.dryun.domain.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WechatUserServiceImpl implements WechatUserService {

    @Autowired
    private WechatUserMapper wechatUserMapper;

    @Override
    public Integer addWechatUser(WechatUser wechatUser) {
        return wechatUserMapper.addWechatUser(wechatUser);
    }

    @Override
    public WechatUser selectUserByOpenId(String openId) {
        WechatUser wechatUser = wechatUserMapper.selectUserByOpenId(openId);
        if (wechatUser!=null){
            return wechatUser;
        }else {
            return null;
        }
    }

    @Override
    public Integer updateUserByOpenId(WechatUser wechatUser) {
        return wechatUserMapper.updateUserByOpenId(wechatUser);
    }
}
