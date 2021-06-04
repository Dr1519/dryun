package org.dryun.domain.entity;

import java.io.Serializable;

public class GoodsAndIfy implements Serializable {

    private Integer id;
    private String classifyId;
    private String goodsId;

    public GoodsAndIfy() {
    }

    public GoodsAndIfy(Integer id, String classifyId, String goodsId) {
        this.id = id;
        this.classifyId = classifyId;
        this.goodsId = goodsId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
}
