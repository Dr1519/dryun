package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.AdminUser;

import java.util.List;

@Mapper
public interface AdminUserMapper {

    AdminUser adminLogin(String adminUserNumber,String adminUserPass);

    AdminUser finAdminUserByNumber(String adminUserNumber);

    List<AdminUser> allAdminUser();


}
