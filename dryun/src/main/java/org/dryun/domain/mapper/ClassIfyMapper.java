package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.ClassIfy;

import java.util.List;

@Mapper
public interface ClassIfyMapper {
    //所有分区
    List<ClassIfy> finAllClassIfy();

    //添加分区
    Integer addClassIfy(ClassIfy classIfy);

    //删除分区
    Integer delClassIfy(String classIfyId);

    //更新分区
    Integer updetaClassIfy(ClassIfy classIfy);
}
