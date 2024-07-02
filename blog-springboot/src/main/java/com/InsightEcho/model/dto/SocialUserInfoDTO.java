package com.InsightEcho.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
/**
 * ClassName:SocialUserInfoDTO
 * Package:com.InsightEcho.model.dto
 * Description:第三方账号信息DTO
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:07
 * @Version:v1.0
 */
@Data
@Builder
@ApiModel(description = "第三方账号信息DTO")
public class SocialUserInfoDTO {

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private String id;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;
}
