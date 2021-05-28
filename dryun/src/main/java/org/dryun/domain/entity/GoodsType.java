package org.dryun.domain.entity;

import java.io.Serializable;

public class GoodsType implements Serializable {
    private Integer id;
    private String goodsTypeId;
    private String goodsTypeName;
    private String goodsTypeImg;
    private String goodsTypeState;

    public GoodsType() {
    }

    public GoodsType(Integer id, String goodsTypeId, String goodsTypeName, String goodsTypeImg, String goodsTypeState) {
        this.id = id;
        this.goodsTypeId = goodsTypeId;
        this.goodsTypeName = goodsTypeName;
        this.goodsTypeImg = goodsTypeImg;
        this.goodsTypeState = goodsTypeState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getGoodsTypeImg() {
        return goodsTypeImg;
    }

    public void setGoodsTypeImg(String goodsTypeImg) {
        this.goodsTypeImg = goodsTypeImg;
    }

    public String getGoodsTypeState() {
        return goodsTypeState;
    }

    public void setGoodsTypeState(String goodsTypeState) {
        this.goodsTypeState = goodsTypeState;
    }
}
