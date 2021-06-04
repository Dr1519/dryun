package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.GoodsAndIfy;
import org.dryun.domain.mapper.GoodsAndIfyMapper;
import org.dryun.domain.service.GoodsAndIfyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsAndIfyServiceImpl implements GoodsAndIfyService {
    @Autowired
    private GoodsAndIfyMapper goodsAndIfyMapper;

    @Override
    public Integer addGoodsAndIfy(GoodsAndIfy goodsAndIfy) {
        return goodsAndIfyMapper.addGoodsAndIfy(goodsAndIfy);
    }

    @Override
    public Integer delGoodsAndIfyByGoodsId(String goodsId) {
        return goodsAndIfyMapper.delGoodsAndIfyByGoodsId(goodsId);
    }

    @Override
    public Integer delGoodsAndIfyByClassifyId(String classifyId) {
        return goodsAndIfyMapper.delGoodsAndIfyByClassifyId(classifyId);
    }
}
