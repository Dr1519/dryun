package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.GoodsTypeAndIfy;
import org.dryun.domain.mapper.GoodsTypeAndIfyMapper;
import org.dryun.domain.service.GoodsTypeAndIfyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsTypeAndIfyServiceImpl implements GoodsTypeAndIfyService {

    @Autowired
    private GoodsTypeAndIfyMapper goodsTypeAndIfyMapper;

    @Override
    public Integer addGoodsTypeAndIfy(GoodsTypeAndIfy goodsTypeAndIfy) {
        return goodsTypeAndIfyMapper.addGoodsTypeAndIfy(goodsTypeAndIfy);
    }

    @Override
    public Integer delGoodsTypeAndIfyByClassIfyId(String classIfyId) {
        return goodsTypeAndIfyMapper.delGoodsTypeAndIfyByClassIfyId(classIfyId);
    }

    @Override
    public Integer delGoodsTypeAndIfyByGoodsTypeId(String goodsTypeId) {
        return goodsTypeAndIfyMapper.delGoodsTypeAndIfyByGoodsTypeId(goodsTypeId);
    }
}
