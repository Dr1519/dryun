package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.ClassIfy;
import org.dryun.domain.mapper.ClassIfyMapper;
import org.dryun.domain.service.ClassIfyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassIfyServiceImpl implements ClassIfyService {
    @Autowired
    private ClassIfyMapper classIfyMapper;
    @Override
    public List<ClassIfy> finAllClassIfy() {
        List<ClassIfy> classIfyList = classIfyMapper.finAllClassIfy();
        if (classIfyList!=null){
            return classIfyList;
        }else {
            return null;
        }
    }

    @Override
    public Integer addClassIfy(ClassIfy classIfy) {
        return classIfyMapper.addClassIfy(classIfy);
    }

    @Override
    public Integer delClassIfy(String classIfyId) {
        return classIfyMapper.delClassIfy(classIfyId);
    }

    @Override
    public Integer updetaClassIfy(ClassIfy classIfy) {
        return classIfyMapper.updetaClassIfy(classIfy);
    }
}
