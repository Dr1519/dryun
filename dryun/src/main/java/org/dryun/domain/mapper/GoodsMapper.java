package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.Goods;

import java.util.List;

@Mapper
public interface GoodsMapper {

    List<Goods> finAllGoods();

    List<Goods> finGoodsByType(String goodsTypeId);
}
