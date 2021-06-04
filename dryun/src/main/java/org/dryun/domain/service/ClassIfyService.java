package org.dryun.domain.service;

import org.dryun.domain.entity.ClassIfy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassIfyService {

    List<ClassIfy> finAllClassIfy();

    //添加分区
    Integer addClassIfy(ClassIfy classIfy);

    //删除分区
    Integer delClassIfy(String classIfyId);

    //更新分区
    Integer updetaClassIfy(ClassIfy classIfy);
}
