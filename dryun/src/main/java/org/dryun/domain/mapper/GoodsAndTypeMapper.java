package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.GoodsAndType;

@Mapper
public interface GoodsAndTypeMapper {

    //添加分类-商品关联
    Integer addGoodsAndType(GoodsAndType goodsAndType);

    //删除分类-商品关联（删除商品时，根据goodsId）
    Integer delGoodsAndTypeByGoodsId(String goodsId);

    //删除分类-商品关联（删除分类时，goodsTypeId）
    Integer delGoodsAndTypeByGoodsTypeId(String goodsTypeId);
}
