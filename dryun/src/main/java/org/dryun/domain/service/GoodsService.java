package org.dryun.domain.service;

import org.dryun.domain.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsService {

    List<Goods> finAllGoods();

    List<Goods> finGoodsByType(String goodsTypeId);
}
