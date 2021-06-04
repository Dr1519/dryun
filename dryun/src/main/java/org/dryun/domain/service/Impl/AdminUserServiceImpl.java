package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.AdminUser;
import org.dryun.domain.mapper.AdminUserMapper;
import org.dryun.domain.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminUserMapper adminUserMapper;
    @Override
    public AdminUser adminLogin(String adminUserNumber, String adminUserPass) {
        AdminUser adminUser = adminUserMapper.adminLogin(adminUserNumber, adminUserPass);
        if (adminUser!=null){
            return adminUser;
        }else {
            return null;
        }
    }

    @Override
    public AdminUser finAdminUserByNumber(String adminUserNumber) {
        AdminUser adminUser = adminUserMapper.finAdminUserByNumber(adminUserNumber);
        if (adminUser!=null){
            return adminUser;
        }else {
            return null;
        }
    }

    @Override
    public List<AdminUser> allAdminUser() {
        List<AdminUser> adminUserList = adminUserMapper.allAdminUser();
        if (adminUserList!=null){
            return adminUserList;
        }else {
            return null;
        }
    }
}
