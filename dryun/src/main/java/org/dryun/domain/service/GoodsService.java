package org.dryun.domain.service;

import org.dryun.domain.entity.Goods;
import org.dryun.domain.entity.GoodsPack;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsService {

    List<Goods> finAllGoods();

    //所有商品（后台）
    List<List<?>> queryGoodsPage(GoodsPack goodsPack);

    List<Goods> finGoodsByType(String goodsTypeId);
}
