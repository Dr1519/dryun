package org.dryun.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class WechatUser {
    private static final long serialVersionUID = 1L;

    private String openId;

    private String skey;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lastVisitTime;

    private String sessionKey;

    private String city;

    private String province;

    private String country;

    private String avatarUrl;

    private Integer gender;

    private String nickName;


    public WechatUser() {
    }

    public WechatUser(String openId, String skey, Date createTime, Date lastVisitTime, String sessionKey, String city, String province, String country, String avatarUrl, Integer gender, String nickName) {
        this.openId = openId;
        this.skey = skey;
        this.createTime = createTime;
        this.lastVisitTime = lastVisitTime;
        this.sessionKey = sessionKey;
        this.city = city;
        this.province = province;
        this.country = country;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.nickName = nickName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSkey() {
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(Date lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
