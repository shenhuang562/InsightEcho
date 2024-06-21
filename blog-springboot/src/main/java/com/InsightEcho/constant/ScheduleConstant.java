package com.InsightEcho.constant;

/**
 * ClassName:ScheduleConstant
 * Package:com.InsightEcho.constant
 * Description:任务调度常量
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午4:24
 * @Version:v1.0
 */
public class ScheduleConstant {

    /**
     * 执行类名
     */
    public static final String TASK_CLASS_NAME = "TASK_CLASS_NAME";

    /**
     * 执行目标key
     */
    public static final String TASK_PROPERTIES = "TASK_PROPERTIES";

    /**
     * 默认
     */
    public static final int MISFIRE_DEFAULT = 0;

    /**
     * 立即触发执行
     */
    public static final int MISFIRE_IGNORE_MISFIRES = 1;

    /**
     * 触发一次执行
     */
    public static final int MISFIRE_FIRE_AND_PROCEED = 2;

    /**
     * 不触发立即执行
     */
    public static final int MISFIRE_DO_NOTHING = 3;
}
