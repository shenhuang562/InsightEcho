package com.InsightEcho.annotation;

import java.lang.annotation.*;

/**
 * ClassName:AccessLimit
 * Package:com.InsightEcho.annotation
 * Description:Redis限流注解
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午3:29
 * @Version:v1.0
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AccessLimit {
    /**
     * 限制周期(秒)
     */
    int seconds();

    /**
     * 规定周期内限制次数
     */
    int maxCount();

    /**
     * 触发限制时的消息提示
     */
    String msg() default "操作过于频繁请稍后再试";

}
