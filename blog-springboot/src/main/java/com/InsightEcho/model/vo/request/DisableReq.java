package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
/**
 * ClassName:DisableReq
 * Package:com.InsightEcho.model.vo.request
 * Description:禁用状态Request
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:59
 * @Version:v1.0
 */
@Data
@ApiModel(description = "禁用状态Request")
public class DisableReq {
    /**
     * id
     */
    @NotNull(message = "id不能为空")
    @ApiModelProperty(value = "id", required = true)
    private Integer id;

    /**
     * 是否禁用 (0否 1是)
     */
    @NotNull(message = "状态不能为空")
    @ApiModelProperty(value = "是否禁用 (0否 1是)", required = true)
    private Integer isDisable;
}
