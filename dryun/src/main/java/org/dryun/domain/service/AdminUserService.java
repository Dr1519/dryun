package org.dryun.domain.service;

import org.dryun.domain.entity.AdminUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminUserService {

    AdminUser adminLogin(String adminUserNumber, String adminUserPass);

    AdminUser finAdminUserByNumber(String adminUserNumber);

    List<AdminUser> allAdminUser();
}
