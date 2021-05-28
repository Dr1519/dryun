package org.dryun.domain.entity;

import java.io.Serializable;

public class Goods implements Serializable {
    private Integer id;
    private String goodsId;
    private String goodsName;
    private String goodsImg;
    private Double goodsOriginalPrice;
    private Double goodsPresentPrice;
    private Integer goodsState;

    public Goods() {
    }

    public Goods(Integer id, String goodsId, String goodsName, String goodsImg, Double goodsOriginalPrice, Double goodsPresentPrice, Integer goodsState) {
        this.id = id;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsImg = goodsImg;
        this.goodsOriginalPrice = goodsOriginalPrice;
        this.goodsPresentPrice = goodsPresentPrice;
        this.goodsState = goodsState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Double getGoodsOriginalPrice() {
        return goodsOriginalPrice;
    }

    public void setGoodsOriginalPrice(Double goodsOriginalPrice) {
        this.goodsOriginalPrice = goodsOriginalPrice;
    }

    public Double getGoodsPresentPrice() {
        return goodsPresentPrice;
    }

    public void setGoodsPresentPrice(Double goodsPresentPrice) {
        this.goodsPresentPrice = goodsPresentPrice;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }
}
