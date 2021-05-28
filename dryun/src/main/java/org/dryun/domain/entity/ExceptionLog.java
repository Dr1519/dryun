package org.dryun.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class ExceptionLog implements Serializable {
    private Integer id;
    private String excId;
    private String excRequParam;
    private String excName;
    private String excMessage;
    private String excUserId;
    private String excUserName;
    private String excMethod;
    private String excUrl;
    private String excIp;
    private String excVer;
    private Date excCreateTime;

    public ExceptionLog() {
    }

    public ExceptionLog(Integer id, String excId, String excRequParam, String excName, String excMessage, String excUserId, String excUserName, String excMethod, String excUrl, String excIp, String excVer, Date excCreateTime) {
        this.id = id;
        this.excId = excId;
        this.excRequParam = excRequParam;
        this.excName = excName;
        this.excMessage = excMessage;
        this.excUserId = excUserId;
        this.excUserName = excUserName;
        this.excMethod = excMethod;
        this.excUrl = excUrl;
        this.excIp = excIp;
        this.excVer = excVer;
        this.excCreateTime = excCreateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExcId() {
        return excId;
    }

    public void setExcId(String excId) {
        this.excId = excId;
    }

    public String getExcRequParam() {
        return excRequParam;
    }

    public void setExcRequParam(String excRequParam) {
        this.excRequParam = excRequParam;
    }

    public String getExcName() {
        return excName;
    }

    public void setExcName(String excName) {
        this.excName = excName;
    }

    public String getExcMessage() {
        return excMessage;
    }

    public void setExcMessage(String excMessage) {
        this.excMessage = excMessage;
    }

    public String getExcUserId() {
        return excUserId;
    }

    public void setExcUserId(String excUserId) {
        this.excUserId = excUserId;
    }

    public String getExcUserName() {
        return excUserName;
    }

    public void setExcUserName(String excUserName) {
        this.excUserName = excUserName;
    }

    public String getExcMethod() {
        return excMethod;
    }

    public void setExcMethod(String excMethod) {
        this.excMethod = excMethod;
    }

    public String getExcUrl() {
        return excUrl;
    }

    public void setExcUrl(String excUrl) {
        this.excUrl = excUrl;
    }

    public String getExcIp() {
        return excIp;
    }

    public void setExcIp(String excIp) {
        this.excIp = excIp;
    }

    public String getExcVer() {
        return excVer;
    }

    public void setExcVer(String excVer) {
        this.excVer = excVer;
    }

    public Date getExcCreateTime() {
        return excCreateTime;
    }

    public void setExcCreateTime(Date excCreateTime) {
        this.excCreateTime = excCreateTime;
    }
}
