package com.InsightEcho.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
/**
 * ClassName:SocialTokenDTO
 * Package:com.InsightEcho.model.dto
 * Description:第三方token
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:06
 * @Version:v1.0
 */
@Data
@Builder
@ApiModel(description = "第三方token")
public class SocialTokenDTO {
    /**
     * 开放id
     */
    @ApiModelProperty(value = "开放id")
    private String openId;

    /**
     * 访问令牌
     */
    @ApiModelProperty(value = "访问令牌")
    private String accessToken;

    /**
     * 登录类型
     */
    @ApiModelProperty(value = "登录类型")
    private Integer loginType;
}
