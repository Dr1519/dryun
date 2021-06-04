package org.dryun.shiro;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.dryun.domain.entity.AdminUser;
import org.dryun.domain.service.AdminUserService;
import org.dryun.jwt.JwtToken;
import org.dryun.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * MyRealm:自定义一个授权
 *
 * @author 晨初
 * @date: 2020/12/25
 */
@Component
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private AdminUserService adminUserService;


    /**
     * 必须重写此方法，不然Shiro会报错
     * @param token
     * @return
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }


    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     * @param principalCollection
     * @return
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String adminUserNumber = JwtUtil.getUsername(principalCollection.toString());
        AdminUser adminUser = adminUserService.finAdminUserByNumber(adminUserNumber);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        return simpleAuthorizationInfo;

    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getCredentials();
        System.err.println("myRealm的token:"+token);
        // 解密获得username，用于和数据库进行对比
        String adminUserNumber = null;
        try {
            //这里工具类没有处理空指针等异常这里处理一下(这里处理科学一些)
            adminUserNumber = JwtUtil.getUsername(token);
            System.err.println(adminUserNumber);
        } catch (Exception e) {
            throw new AuthenticationException("heard的token拼写错误或者值为空");
        }if (token == null){
            throw new AuthenticationException("未登录!");
        }
        AdminUser adminUser = adminUserService.finAdminUserByNumber(adminUserNumber);
        if (adminUser == null) {
            //log.error("用户不存在!)");
            System.err.println("用户不存在");
            throw new AuthenticationException("用户不存在!");
        }
        if (!JwtUtil.verify(token, adminUserNumber,adminUser.getAdminUserPass())) {
            //log.error("用户名或密码错误(token无效或者与登录者不匹配)!)");
            System.err.println("用户名或密码错误(token无效或者与登录者不匹配)!)");
            throw new AuthenticationException("用户名或密码错误(token无效或者与登录者不匹配)!");
        }
        return new SimpleAuthenticationInfo(token, token, "my_realm");
    }
}
