package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.GoodsAndIfy;

@Mapper
public interface GoodsAndIfyMapper {

    //添加商品-分区关联
    Integer addGoodsAndIfy(GoodsAndIfy goodsAndIfy);

    //删除商品-分区关联（删除商品时，根据goodsId)
    Integer delGoodsAndIfyByGoodsId(String goodsId);

    //删除商品-分区关联（删除分区时，根据classifyId)
    Integer delGoodsAndIfyByClassifyId(String classifyId);

}
