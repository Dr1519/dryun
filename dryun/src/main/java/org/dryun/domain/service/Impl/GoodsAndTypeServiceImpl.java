package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.GoodsAndType;
import org.dryun.domain.mapper.GoodsAndTypeMapper;
import org.dryun.domain.service.GoodsAndTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsAndTypeServiceImpl implements GoodsAndTypeService {

    @Autowired
    private GoodsAndTypeMapper goodsAndTypeMapper;
    @Override
    public Integer addGoodsAndType(GoodsAndType goodsAndType) {
        return goodsAndTypeMapper.addGoodsAndType(goodsAndType);
    }

    @Override
    public Integer delGoodsAndTypeByGoodsId(String goodsId) {
        return goodsAndTypeMapper.delGoodsAndTypeByGoodsId(goodsId);
    }

    @Override
    public Integer delGoodsAndTypeByGoodsTypeId(String goodsTypeId) {
        return goodsAndTypeMapper.delGoodsAndTypeByGoodsTypeId(goodsTypeId);
    }
}
