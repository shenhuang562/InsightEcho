package com.InsightEcho.validator;

import com.InsightEcho.annotation.EnumValid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * ClassName:EnumBalidator
 * Package:com.InsightEcho.validator
 * Description:枚举类型校验器
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午3:58
 * @Version:v1.0
 */
public class EnumValidator implements ConstraintValidator<EnumValid, Integer> {
    private final Set<Integer> set = new HashSet<>();

    /**
     * 初始化
     *
     * @param constraintAnnotation 评论类型注解
     */
    @Override
    public void initialize(EnumValid constraintAnnotation) {
        for (int value : constraintAnnotation.values()) {
            set.add(value);
        }
    }

    /**
     * 校验方法
     *
     * @param value                      校验的值
     * @param constraintValidatorContext 上下文
     * @return 是否校验成功
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(value);
    }
}
