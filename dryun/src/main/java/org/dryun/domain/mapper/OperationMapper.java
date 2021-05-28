package org.dryun.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dryun.domain.entity.OperaPack;
import org.dryun.domain.entity.OperationLog;

import java.util.List;

/**
 * @Auther: 晨初
 * @Date: $date$
 * @Description:
 */
@Mapper
public interface OperationMapper {

    //添加操作记录
    Integer addOperLog(OperationLog operationLog);

    //总条数
    Integer countOperLog();

    //分页
    List<List<?>> queryOperLogPage(OperaPack operaPack);
}
