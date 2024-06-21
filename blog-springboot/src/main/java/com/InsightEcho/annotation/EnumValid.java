package com.InsightEcho.annotation;

import com.InsightEcho.validator.EnumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * ClassName:EnumValid
 * Package:com.InsightEcho.annotation
 * Description:评论类型注解
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午3:29
 * @Version:v1.0
 */
@Documented
@Constraint(validatedBy = {EnumValidator.class})
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnumValid {

    String message() default "{javax.validation.constraints.NotBlank.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * @return 评论类型
     */
    int[] values() default {};

}
