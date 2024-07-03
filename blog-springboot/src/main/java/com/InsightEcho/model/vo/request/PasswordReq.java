package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
/**
 * ClassName:PasswordReq
 * Package:com.InsightEcho.model.vo.request
 * Description:用户密码
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午11:02
 * @Version:v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "用户密码")
public class PasswordReq {

    /**
     * 旧密码
     */
    @NotBlank(message = "旧密码不能为空")
    @ApiModelProperty(value = "旧密码", required = true)
    private String oldPassword;

    /**
     * 新密码
     */
    @Size(min = 6, message = "新密码不能少于6位")
    @NotBlank(message = "新密码不能为空")
    @ApiModelProperty(value = "新密码", required = true)
    private String newPassword;
}
