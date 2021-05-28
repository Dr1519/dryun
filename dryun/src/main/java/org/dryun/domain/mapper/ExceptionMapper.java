package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.ExceptionLog;
import org.dryun.domain.entity.OperaPack;
import org.dryun.domain.entity.OperationLog;

import java.util.List;

/**
 * @Auther: 晨初
 * @Date: $date$
 * @Description:
 */
@Mapper
public interface ExceptionMapper {

    //添加异常记录
    Integer addExcLog(ExceptionLog exceptionLog);

    //总条数
    Integer countExcepLog();

    //分页
    List<List<?>> queryExcepLogPage(OperaPack operaPack);
}
