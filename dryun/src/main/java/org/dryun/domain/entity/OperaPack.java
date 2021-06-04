package org.dryun.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Auther: 晨初
 * @Date: $date$
 * @Description:
 */
public class OperaPack {
    private Integer pageNo;
    private Integer pageSize;
    private String adminUserId;
    private String operType;
    private String startDate;
    private String endDate;
    public OperaPack() {
    }

    public OperaPack(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public OperaPack(Integer pageNo, Integer pageSize, String adminUserId, String operType, String startDate, String endDate) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.adminUserId = adminUserId;
        this.operType = operType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "OperaPack{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", adminUserId='" + adminUserId + '\'' +
                ", operType='" + operType + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
