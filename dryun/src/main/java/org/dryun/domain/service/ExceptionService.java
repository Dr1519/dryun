package org.dryun.domain.service;

import org.dryun.domain.entity.ExceptionLog;
import org.dryun.domain.entity.OperaPack;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 晨初
 * @Date: $date$
 * @Description:
 */
@Service
public interface ExceptionService {

    //添加异常记录
    Integer addExcLog(ExceptionLog exceptionLog);

    //分页
    List<List<?>> queryExcepLogPage(OperaPack operaPack);
}
