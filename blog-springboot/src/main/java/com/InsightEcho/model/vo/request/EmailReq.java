package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
/**
 * ClassName:EmailReq
 * Package:com.InsightEcho.model.vo.request
 * Description:邮箱Request
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午11:00
 * @Version:v1.0
 */
@Data
@ApiModel(description = "邮箱Request")
public class EmailReq {

    /**
     * 邮箱
     */
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    @ApiModelProperty(value = "邮箱", required = true)
    private String email;

    /**
     * 验证码
     */
    @NotBlank(message = "验证码不能为空")
    @ApiModelProperty(value = "验证码", required = true)
    private String code;
}