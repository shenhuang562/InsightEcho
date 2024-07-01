package com.InsightEcho.manager.factory;

import cn.hutool.extra.spring.SpringUtil;
import com.InsightEcho.entity.ExceptionLog;
import com.InsightEcho.entity.OperationLog;
import com.InsightEcho.entity.VisitLog;
import com.InsightEcho.service.ExceptionLogService;
import com.InsightEcho.service.OperationLogService;
import com.InsightEcho.service.VisitLogService;

import java.util.TimerTask;
/**
 * ClassName:AsyncFactory
 * Package:com.InsightEcho.manager.factory
 * Description:异步工厂（产生任务用）
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午7:55
 * @Version:v1.0
 */
public class AsyncFactory {

    /**
     * 记录操作日志
     *
     * @param operationLog 操作日志信息
     * @return 任务task
     */
    public static TimerTask recordOperation(OperationLog operationLog) {
        return new TimerTask() {
            @Override
            public void run() {
                SpringUtil.getBean(OperationLogService.class).saveOperationLog(operationLog);
            }
        };
    }

    /**
     * 记录异常日志
     *
     * @param exceptionLog 异常日志信息
     * @return 任务task
     */
    public static TimerTask recordException(ExceptionLog exceptionLog) {
        return new TimerTask() {
            @Override
            public void run() {
                SpringUtil.getBean(ExceptionLogService.class).saveExceptionLog(exceptionLog);
            }
        };
    }

    /**
     * 记录访问日志
     *
     * @param visitLog 访问日志信息
     * @return 任务task
     */
    public static TimerTask recordVisit(VisitLog visitLog) {
        return new TimerTask() {
            @Override
            public void run() {
                SpringUtil.getBean(VisitLogService.class).saveVisitLog(visitLog);
            }
        };
    }
}
