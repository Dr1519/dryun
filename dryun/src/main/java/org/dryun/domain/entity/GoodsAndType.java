package org.dryun.domain.entity;

import java.io.Serializable;

public class GoodsAndType implements Serializable {
    private Integer id;
    private String goodsId;
    private String goodsTypeId;

    public GoodsAndType() {
    }

    public GoodsAndType(Integer id, String goodsId, String goodsTypeId) {
        this.id = id;
        this.goodsId = goodsId;
        this.goodsTypeId = goodsTypeId;
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

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }
}
