package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.Goods;
import org.dryun.domain.entity.GoodsPack;

import java.util.List;

@Mapper
public interface GoodsMapper {
    //所有商品（小程序）
    List<Goods> finAllGoods();

    //所有商品（后台）
    List<List<?>> queryGoodsPage(GoodsPack goodsPack);

    //根据分类查找商品（小程序）
    List<Goods> finGoodsByType(String goodsTypeId);

    //添加商品
    Integer addGoods(Goods goods);
}
