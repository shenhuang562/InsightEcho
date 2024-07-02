package com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:TaskStatusEnum
 * Package:main.java.com.InsightEcho.enums
 * Description:任务状态枚举
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午10:41
 * @Version:v1.0
 */
@Getter
@AllArgsConstructor
public enum TaskStatusEnum {
    /**
     * 运行
     */
    RUNNING(0),

    /**
     * 暂停
     */
    PAUSE(1);

    /**
     * 状态
     */
    private final Integer status;
}
