package com.InsightEcho.annotation;

import com.InsightEcho.annotation.serialize.DesensitizationSerialize;
import com.InsightEcho.enums.DesensitizationTypeEnum;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.lang.annotation.*;

/**
 * ClassName:Desensitization
 * Package:com.InsightEcho.annotation
 * Description:脱敏注解
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午3:28
 * @Version:v1.0
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonSerialize(using = DesensitizationSerialize.class)
public @interface Desensitization {
    /**
     * 脱敏数据类型，在MY_RULE的时候，startInclude和endExclude生效
     */
    DesensitizationTypeEnum type() default DesensitizationTypeEnum.MY_RULE;

    Class<?>[] groups();

    Class<?>[] payload();

    /**
     * 脱敏开始位置（包含）
     */
    int startInclude() default 0;

    /**
     * 脱敏结束位置（不包含）
     */
    int endExclude() default 0;

}
