package org.dryun.domain.entity;

import java.io.Serializable;

public class AdminUser implements Serializable {
    private Integer id;
    private String adminUserId;
    private String adminUserNumber;
    private String adminUserName;
    private String adminUserPass;
    private String adminUserImg;
    private Integer adminUserState;

    public AdminUser() {
    }

    public AdminUser(Integer id, String adminUserId, String adminUserNumber, String adminUserName, String adminUserPass, String adminUserImg, Integer adminUserState) {
        this.id = id;
        this.adminUserId = adminUserId;
        this.adminUserNumber = adminUserNumber;
        this.adminUserName = adminUserName;
        this.adminUserPass = adminUserPass;
        this.adminUserImg = adminUserImg;
        this.adminUserState = adminUserState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getAdminUserNumber() {
        return adminUserNumber;
    }

    public void setAdminUserNumber(String adminUserNumber) {
        this.adminUserNumber = adminUserNumber;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminUserPass() {
        return adminUserPass;
    }

    public void setAdminUserPass(String adminUserPass) {
        this.adminUserPass = adminUserPass;
    }

    public String getAdminUserImg() {
        return adminUserImg;
    }

    public void setAdminUserImg(String adminUserImg) {
        this.adminUserImg = adminUserImg;
    }

    public Integer getAdminUserState() {
        return adminUserState;
    }

    public void setAdminUserState(Integer adminUserState) {
        this.adminUserState = adminUserState;
    }
}
