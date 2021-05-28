package org.dryun.domain.entity;

import java.io.Serializable;

public class IfyAndGoodsType implements Serializable {
    private Integer id;
    private String classIfyId;
    private String goodsTypeId;

    public IfyAndGoodsType() {
    }

    public IfyAndGoodsType(Integer id, String classIfyId, String goodsTypeId) {
        this.id = id;
        this.classIfyId = classIfyId;
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
