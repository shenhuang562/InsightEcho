package com.InsightEcho.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:GitUserInfoDTO
 * Package:com.InsightEcho.model.dto
 * Description:Git用户信息DTO
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:16
 * @Version:v1.0
 */
@Data
@ApiModel(description = "Git用户信息DTO")
public class GitUserInfoDTO {

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private String id;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar_url;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String name;

    /**
     * 登录
     */
    @ApiModelProperty(value = "登录")
    private String login;
}
