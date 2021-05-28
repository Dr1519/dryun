package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.ClassIfy;

import java.util.List;

@Mapper
public interface ClassIfyMapper {

    List<ClassIfy> finAllClassIfy();
}
