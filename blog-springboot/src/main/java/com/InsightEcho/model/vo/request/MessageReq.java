package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
/**
 * ClassName:MessageReq
 * Package:com.InsightEcho.model.vo.request
 * Description:留言Request
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午11:01
 * @Version:v1.0
 */
@Data
@ApiModel(description = "留言Request")
public class MessageReq {

    /**
     * 昵称
     */
    @NotBlank(message = "昵称不能为空")
    @ApiModelProperty(value = "昵称", required = true)
    private String nickname;

    /**
     * 头像
     */
    @NotBlank(message = "头像不能为空")
    @ApiModelProperty(value = "头像", required = true)
    private String avatar;

    /**
     * 留言内容
     */
    @NotBlank(message = "留言内容不能为空")
    @ApiModelProperty(value = "留言内容", required = true)
    private String messageContent;
}