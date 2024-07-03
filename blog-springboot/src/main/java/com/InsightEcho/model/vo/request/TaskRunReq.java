package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:TaskRunReq
 * Package:com.InsightEcho.model.vo.request
 * Description:定时任务运行Request
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:49
 * @Version:v1.0
 */
@Data
@ApiModel(description = "定时任务运行Request")
public class TaskRunReq {

    /**
     * 任务id
     */
    @ApiModelProperty(value = "任务id")
    private Integer id;

    /**
     * 任务组别
     */
    @ApiModelProperty(value = "任务组别")
    private String taskGroup;
}
