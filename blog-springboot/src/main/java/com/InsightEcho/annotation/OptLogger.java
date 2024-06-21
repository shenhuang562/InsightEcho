package com.InsightEcho.annotation;

import java.lang.annotation.*;

/**
 * ClassName:OptLogger
 * Package:com.InsightEcho.annotation
 * Description:操作日志注解
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午3:29
 * @Version:v1.0
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OptLogger {
    /**
     * @return 操作描述
     */
    String value() default "";
}
