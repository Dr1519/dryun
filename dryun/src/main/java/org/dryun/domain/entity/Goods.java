package org.dryun.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Goods implements Serializable {
    private Integer id;
    private String goodsId;
    private String goodsName;
    private String goodsImg;
    private Double goodsPrice;
    private String goodsDesc;
    private Integer goodsStock;
    private Integer goodsSales;
    private Date goodsLaunchTime;
    private Integer goodsState;
    List<ClassIfy> classIfies;
    List<GoodsType> goodsTypes;

    public Goods() {
    }

    public Goods(Integer id, String goodsId, String goodsName, String goodsImg, Double goodsPrice, String goodsDesc, Integer goodsStock, Integer goodsSales, Date goodsLaunchTime, Integer goodsState, List<ClassIfy> classIfies, List<GoodsType> goodsTypes) {
        this.id = id;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsImg = goodsImg;
        this.goodsPrice = goodsPrice;
        this.goodsDesc = goodsDesc;
        this.goodsStock = goodsStock;
        this.goodsSales = goodsSales;
        this.goodsLaunchTime = goodsLaunchTime;
        this.goodsState = goodsState;
        this.classIfies = classIfies;
        this.goodsTypes = goodsTypes;
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

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Date getGoodsLaunchTime() {
        return goodsLaunchTime;
    }

    public void setGoodsLaunchTime(Date goodsLaunchTime) {
        this.goodsLaunchTime = goodsLaunchTime;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public List<ClassIfy> getClassIfies() {
        return classIfies;
    }

    public void setClassIfies(List<ClassIfy> classIfies) {
        this.classIfies = classIfies;
    }

    public List<GoodsType> getGoodsTypes() {
        return goodsTypes;
    }

    public void setGoodsTypes(List<GoodsType> goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
}
