package org.dryun.jwt;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * JwtToken:实现shiro的AuthenticationToken接口的类JwtToken
 *
 * @author 晨初
 * @date: 2012/12/25
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
