package org.dryun.domain.service;

import org.dryun.domain.entity.GoodsTypeAndIfy;
import org.springframework.stereotype.Service;

@Service
public interface GoodsTypeAndIfyService {

    //添加分区-分类关联
    Integer addGoodsTypeAndIfy(GoodsTypeAndIfy goodsTypeAndIfy);

    //删除分区-分类关联（删除分区时，根据classIfyId）
    Integer delGoodsTypeAndIfyByClassIfyId(String classIfyId);

    //删除分区-分类关联（删除分类时，根据goodsTypeId）
    Integer delGoodsTypeAndIfyByGoodsTypeId(String goodsTypeId);
}
