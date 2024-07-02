package com.InsightEcho.annotation;

import java.lang.annotation.*;

/**
 * ClassName:VisitLogger
 * Package:com.InsightEcho.annotation
 * Description:访问日志注解
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午3:30
 * @Version:v1.0
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface VisitLogger {
    /**
     * @return 访问页面
     */
    String value() default "";
}
