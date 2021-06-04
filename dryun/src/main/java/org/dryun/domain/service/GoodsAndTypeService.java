package org.dryun.domain.service;

import org.dryun.domain.entity.GoodsAndType;
import org.springframework.stereotype.Service;

@Service
public interface GoodsAndTypeService {

    //添加分类-商品关联
    Integer addGoodsAndType(GoodsAndType goodsAndType);

    //删除分类-商品关联（删除商品时，根据goodsId）
    Integer delGoodsAndTypeByGoodsId(String goodsId);

    //删除分类-商品关联（删除分类时，goodsTypeId）
    Integer delGoodsAndTypeByGoodsTypeId(String goodsTypeId);
}
