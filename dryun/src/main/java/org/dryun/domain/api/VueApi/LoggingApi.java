package org.dryun.domain.api.VueApi;

import org.dryun.common.OperLog;
import org.dryun.domain.entity.OperaPack;
import org.dryun.domain.entity.OperationLog;
import org.dryun.domain.service.ExceptionService;
import org.dryun.domain.service.OperationService;
import org.dryun.untils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: 晨初
 * @Date: $date$
 * @Description:
 */
@Controller
@RequestMapping("api/logging")
public class LoggingApi {

    @Autowired
    private OperationService operationService;
    @Autowired
    private ExceptionService exceptionService;


    @RequestMapping(value = "/getOperaLogList",method = RequestMethod.POST)
    @ResponseBody
    @OperLog(operModul = "Logging", operType = "查询", operDesc = "操作日志列表")
    public Result getOperaLogList(OperaPack operaPack){
        System.err.println("operaPack为："+operaPack.toString());
        List<List<?>> lists = operationService.queryOperLogPage(operaPack);
        List<?> operaList = lists.get(0);
        Integer countOperLog = (Integer) lists.get(1).get(0);
        if (operaList!=null){
            return new Result().build(200,"操作日志数据获取成功",countOperLog,operaList);
        }else {
            return new Result().build(201,"操作日志数据获取失败");
        }
    }
    @RequestMapping(value = "/getExcepLogList",method = RequestMethod.POST)
    @ResponseBody
    @OperLog(operModul = "Logging", operType = "查询", operDesc = "异常日志列表")
    public Result getExcepLogList(OperaPack operaPack){
        List<List<?>> lists = exceptionService.queryExcepLogPage(operaPack);
        List<?> excepList = lists.get(0);
        Integer countExcepLog = (Integer) lists.get(1).get(0);
        if (excepList!=null){
            return new Result().build(200,"异常日志数据获取成功",countExcepLog,excepList);
        }else {
            return new Result().build(201,"异常日志数据获取失败");
        }
    }
}
