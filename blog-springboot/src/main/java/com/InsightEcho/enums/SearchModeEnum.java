package com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName: SearchModeEnum
 * Package: main.java.com.InsightEcho.enums
 * Description: 搜索模式枚举，定义了搜索模式及其对应的搜索策略
 *
 * @Author: mind-king
 * @Create: 2024/6/21 - 上午10:36
 * @Version: v1.0
 */
@Getter
@AllArgsConstructor
public enum SearchModeEnum {

    /**
     * mysql 搜索模式
     */
    MYSQL("mysql", "mySqlSearchStrategyImpl"),

    /**
     * elasticsearch 搜索模式
     */
    ELASTICSEARCH("elasticsearch", "esSearchStrategyImpl");

    /**
     * 模式名称
     */
    private final String mode;

    /**
     * 对应的搜索策略类名
     */
    private final String strategy;

    /**
     * 根据模式获取对应的搜索策略类名
     *
     * @param mode 模式名称
     * @return 搜索策略类名，如果未找到返回null
     */
    public static String getStrategy(String mode) {
        if (mode == null) {
            return null;
        }
        for (SearchModeEnum value : values()) {
            if (value.getMode().equals(mode)) {
                return value.getStrategy();
            }
        }
        return null;
    }
}
