package org.dryun.domain.service.Impl;

import org.dryun.domain.entity.ExceptionLog;
import org.dryun.domain.entity.OperaPack;
import org.dryun.domain.mapper.ExceptionMapper;
import org.dryun.domain.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 晨初
 * @Date: $date$
 * @Description:
 */
@Service
public class ExceptionServiceImpl implements ExceptionService {
    @Autowired
    private ExceptionMapper exceptionMapper;

    @Override
    public Integer addExcLog(ExceptionLog exceptionLog) {
        return exceptionMapper.addExcLog(exceptionLog);
    }

    @Override
    public List<List<?>> queryExcepLogPage(OperaPack operaPack) {
        List<List<?>> lists = exceptionMapper.queryExcepLogPage(operaPack);
        if (lists!=null){
            return lists;
        }else {
            return null;
        }
    }
}
