package com.InsightEcho.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:TokenDTO
 * Package:com.InsightEcho.model.dto
 * Description:Token
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:08
 * @Version:v1.0
 */
@Data
@ApiModel(description = "Token")
public class TokenDTO {
    /**
     * 访问令牌
     */
    @ApiModelProperty(value = "访问令牌")
    private String access_token;

    /**
     * 过期时间
     */
    @ApiModelProperty(value = "过期时间")
    private String expires_in;

    /**
     * 刷新token
     */
    @ApiModelProperty(value = "刷新token")
    private String refresh_token;
}
