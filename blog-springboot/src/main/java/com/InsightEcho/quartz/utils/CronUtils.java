package com.InsightEcho.quartz.utils;

import org.quartz.CronExpression;

import java.text.ParseException;
import java.util.Date;
/**
 * ClassName:CronUtils
 * Package:com.InsightEcho.quartz.utils
 * Description:cron表达式工具类
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:34
 * @Version:v1.0
 */
public class CronUtils {

    /**
     * 返回一个布尔值代表一个给定的Cron表达式的有效性
     *
     * @param cronExpression Cron表达式
     * @return boolean 表达式是否有效
     */
    public static boolean isValid(String cronExpression) {
        return CronExpression.isValidExpression(cronExpression);
    }

    /**
     * 返回下一个执行时间根据给定的Cron表达式
     *
     * @param cronExpression Cron表达式
     * @return Date 下次Cron表达式执行时间
     */
    public static Date getNextExecution(String cronExpression) {
        try {
            CronExpression cron = new CronExpression(cronExpression);
            return cron.getNextValidTimeAfter(new Date(System.currentTimeMillis()));
        } catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}