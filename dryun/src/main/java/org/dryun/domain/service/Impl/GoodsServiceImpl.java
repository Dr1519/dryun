package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.Goods;
import org.dryun.domain.mapper.GoodsMapper;
import org.dryun.domain.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> finAllGoods() {
        List<Goods> goodsList = goodsMapper.finAllGoods();
        if (goodsList!=null){
            return goodsList;
        }else {
            return null;
        }
    }

    @Override
    public List<Goods> finGoodsByType(String goodsTypeId) {
        List<Goods> goodsList = goodsMapper.finGoodsByType(goodsTypeId);
        if (goodsList!=null){
            return goodsList;
        }else {
            return null;
        }
    }
}
