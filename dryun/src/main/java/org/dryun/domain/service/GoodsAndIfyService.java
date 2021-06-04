package org.dryun.domain.service;

import org.dryun.domain.entity.GoodsAndIfy;
import org.springframework.stereotype.Service;

@Service
public interface GoodsAndIfyService {

    //添加商品分区关联
    Integer addGoodsAndIfy(GoodsAndIfy goodsAndIfy);

    //删除商品-分区关联（删除商品时，根据goodsId)
    Integer delGoodsAndIfyByGoodsId(String goodsId);

    //删除商品-分区关联（删除分区时，根据classifyId)
    Integer delGoodsAndIfyByClassifyId(String classifyId);
}
