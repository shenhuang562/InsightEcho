package com.InsightEcho.quartz.task;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.InsightEcho.mapper.VisitLogMapper;
import com.InsightEcho.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static com.InsightEcho.constant.RedisConstant.UNIQUE_VISITOR;
/**
 * ClassName:TimedTask
 * Package:com.InsightEcho.quartz.task
 * Description:执行定时任务
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:32
 * @Version:v1.0
 */
@SuppressWarnings(value = "all")
@Component("timedTask")
public class TimedTask {
    @Autowired
    private RedisService redisService;

    @Autowired
    private VisitLogMapper visitLogMapper;

    /**
     * 清除博客访问记录
     */
    public void clear() {
        redisService.deleteObject(UNIQUE_VISITOR);
    }

    /**
     * 测试任务
     */
    public void test() {
        System.out.println("测试任务");
    }

    /**
     * 清除一周前的访问日志
     */
    public void clearVistiLog() {
        DateTime endTime = DateUtil.beginOfDay(DateUtil.offsetDay(new Date(), -7));
        visitLogMapper.deleteVisitLog(endTime);
    }
}
