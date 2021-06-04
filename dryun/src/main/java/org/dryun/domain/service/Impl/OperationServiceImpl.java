package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.OperaPack;
import org.dryun.domain.entity.OperationLog;
import org.dryun.domain.mapper.OperationMapper;
import org.dryun.domain.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 晨初
 * @Date: 2021年5月16号
 * @Description:
 */
@Service
public class OperationServiceImpl implements OperationService {
    @Autowired
    private OperationMapper operationMapper;

    @Override
    public Integer addOperLog(OperationLog operationLog) {
        return operationMapper.addOperLog(operationLog);
    }

    @Override
    public Integer countOperLog() {
        return operationMapper.countOperLog();
    }

    @Override
    public List<List<?>> queryOperLogPage(OperaPack operaPack) {
        List<List<?>> lists = operationMapper.queryOperLogPage(operaPack);
        if (lists!=null){
            return lists;
        }else {
            return null;
        }
    }
}
