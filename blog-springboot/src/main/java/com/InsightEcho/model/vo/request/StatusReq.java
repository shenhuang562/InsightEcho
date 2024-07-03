package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
/**
 * ClassName:StatusReq
 * Package:com.InsightEcho.model.vo.request
 * Description:状态Request
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午10:01
 * @Version:v1.0
 */
@Data
@ApiModel(description = "状态Request")
public class StatusReq {
    /**
     * id
     */
    @NotNull(message = "id不能为空")
    @ApiModelProperty(value = "id", required = true)
    private Integer id;

    /**
     * 状态
     */
    @NotNull(message = "状态不能为空")
    @ApiModelProperty(value = "状态", required = true)
    private Integer status;
}
