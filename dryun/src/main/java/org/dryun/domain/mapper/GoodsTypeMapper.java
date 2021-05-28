package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.GoodsType;

import java.util.List;

@Mapper
public interface GoodsTypeMapper {

    List<GoodsType> finGoodsTypeByClassIfyId(String classIfyId);
}
