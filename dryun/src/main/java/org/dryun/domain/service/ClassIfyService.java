package org.dryun.domain.service;

import org.dryun.domain.entity.ClassIfy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassIfyService {

    List<ClassIfy> finAllClassIfy();
}
