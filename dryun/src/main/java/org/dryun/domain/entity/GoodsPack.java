package org.dryun.domain.entity;

public class GoodsPack {
    private Integer pageNo;
    private Integer pageSize;
    private String classIfyId;
    private String goodsTypeId;
    private String startDate;
    private String endDate;
    private Integer goodsState;

    public GoodsPack() {
    }

    public GoodsPack(Integer pageNo, Integer pageSize, String classIfyId, String goodsTypeId, String startDate, String endDate, Integer goodsState) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.classIfyId = classIfyId;
        this.goodsTypeId = goodsTypeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.goodsState = goodsState;
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

    public String getClassIfyId() {
        return classIfyId;
    }

    public void setClassIfyId(String classIfyId) {
        this.classIfyId = classIfyId;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
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

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }
}
