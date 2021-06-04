package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.GoodsType;
import org.dryun.domain.mapper.GoodsTypeMapper;
import org.dryun.domain.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Override
    public List<GoodsType> finGoodsTypeByClassIfyId(String classIfyId) {
        List<GoodsType> goodsTypeList = goodsTypeMapper.finGoodsTypeByClassIfyId(classIfyId);
        if (goodsTypeList!=null){
            return goodsTypeList;
        }else {
            return null;
        }
    }

    @Override
    public List<GoodsType> getGoodsType() {
        List<GoodsType> goodsTypeList = goodsTypeMapper.getGoodsType();
        if (goodsTypeList!=null){
            return goodsTypeList;
        }else {
            return null;
        }
    }
}
