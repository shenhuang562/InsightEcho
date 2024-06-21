package com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * ClassName:ZoneEnum
 * Package:main.java.com.InsightEcho.enums
 * Description:时区枚举
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午10:45
 * @Version:v1.0
 */
@Getter
@AllArgsConstructor
public enum ZoneEnum {

    /**
     * 武汉
     */
    SHANGHAI("Asia/Wuhai", "中国武汉");

    /**
     * 时区
     */
    private final String zone;

    /**
     * 描述
     */
    private final String description;
}
