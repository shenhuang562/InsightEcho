package com.InsightEcho.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:QqLoginDTO
 * Package:com.InsightEcho.model.dto
 * Description:QQ登录DTO
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:00
 * @Version:v1.0
 */
@Data
@ApiModel(description = "QQ登录DTO")
public class QqLoginDTO {

    /**
     * openId
     */
    @ApiModelProperty(value = "openId")
    private String openid;

    /**
     * clientId
     */
    @ApiModelProperty(value = "clientId")
    private String client_id;
}
