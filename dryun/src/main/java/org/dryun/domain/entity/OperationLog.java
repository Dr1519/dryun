package org.dryun.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class OperationLog implements Serializable {
    private Integer id;
    private String operId;
    private String operModul;
    private String operType;
    private String operDesc;
    private String operRequParam;
    private String operUserId;
    private String operUserName;
    private String operMethod;
    private String operUrl;
    private String operIp;
    private Date operCreateTime;
    private String operVer;

    public OperationLog() {
    }

    public OperationLog(Integer id, String operId, String operModul, String operType, String operDesc, String operRequParam, String operUserId, String operUserName, String operMethod, String operUrl, String operIp, Date operCreateTime, String operVer) {
        this.id = id;
        this.operId = operId;
        this.operModul = operModul;
        this.operType = operType;
        this.operDesc = operDesc;
        this.operRequParam = operRequParam;
        this.operUserId = operUserId;
        this.operUserName = operUserName;
        this.operMethod = operMethod;
        this.operUrl = operUrl;
        this.operIp = operIp;
        this.operCreateTime = operCreateTime;
        this.operVer = operVer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getOperModul() {
        return operModul;
    }

    public void setOperModul(String operModul) {
        this.operModul = operModul;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }

    public String getOperRequParam() {
        return operRequParam;
    }

    public void setOperRequParam(String operRequParam) {
        this.operRequParam = operRequParam;
    }

    public String getOperUserId() {
        return operUserId;
    }

    public void setOperUserId(String operUserId) {
        this.operUserId = operUserId;
    }

    public String getOperUserName() {
        return operUserName;
    }

    public void setOperUserName(String operUserName) {
        this.operUserName = operUserName;
    }

    public String getOperMethod() {
        return operMethod;
    }

    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod;
    }

    public String getOperUrl() {
        return operUrl;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    public String getOperIp() {
        return operIp;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp;
    }

    public Date getOperCreateTime() {
        return operCreateTime;
    }

    public void setOperCreateTime(Date operCreateTime) {
        this.operCreateTime = operCreateTime;
    }

    public String getOperVer() {
        return operVer;
    }

    public void setOperVer(String operVer) {
        this.operVer = operVer;
    }
}
