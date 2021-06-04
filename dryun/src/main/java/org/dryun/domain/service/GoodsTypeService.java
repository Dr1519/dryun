package org.dryun.domain.service;

import org.dryun.domain.entity.GoodsType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsTypeService {

    List<GoodsType> finGoodsTypeByClassIfyId(String classIfyId);

    List<GoodsType> getGoodsType();
}
