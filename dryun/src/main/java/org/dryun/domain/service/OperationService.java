package org.dryun.domain.service;

import org.dryun.domain.entity.OperaPack;
import org.dryun.domain.entity.OperationLog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 晨初
 * @Date: $date$
 * @Description:
 */
@Service
public interface OperationService {

    //添加操作记录
    Integer addOperLog(OperationLog operationLog);

    //总条数
    Integer countOperLog();

    //分页
    List<List<?>> queryOperLogPage(OperaPack operaPack);
}
