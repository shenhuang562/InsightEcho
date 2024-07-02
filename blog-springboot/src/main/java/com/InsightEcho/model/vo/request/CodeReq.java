package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * ClassName:CodeReq
 * Package:com.InsightEcho.model.vo.request
 * Description: Code信息
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:43
 * @Version:v1.0
 */
@Data
@ApiModel(description = "Code信息")
public class CodeReq {

    /**
     * code
     */
    @NotBlank(message = "code不能为空")
    @ApiModelProperty(value = "code", required = true)
    private String code;
}
