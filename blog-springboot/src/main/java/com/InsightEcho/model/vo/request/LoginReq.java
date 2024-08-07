package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
/**
 * ClassName:LoginReq
 * Package:com.InsightEcho.model.vo.request
 * Description:登录信息Request
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午11:00
 * @Version:v1.0
 */
@Data
@ApiModel(description = "登录信息Request")
public class LoginReq {

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名", required = true)
    private String username;

    /**
     * 用户密码
     */
    @NotBlank(message = "密码不能为空")
    @Size(min = 6, message = "密码不能少于6位")
    @ApiModelProperty(value = "用户密码", required = true)
    private String password;

}
