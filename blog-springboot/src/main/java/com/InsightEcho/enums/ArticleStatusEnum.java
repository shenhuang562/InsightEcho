package com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:ArticleStatusEnum
 * Package:main.java.com.InsightEcho.enums
 * Description:文章状态枚举
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午9:53
 * @Version:v1.0
 */
@Getter
@AllArgsConstructor
public enum ArticleStatusEnum {
    /*
    公开
     */
    PUBLIC(1, "公开"),

    /*
    私密
     */
    SECRET(2, "私密"),

    /*
    草稿
     */
    DRAFT(3, "草稿");

    /*
    状态
     */
    private final Integer status;

    /*
    描述
     */
    private final String description;
}
