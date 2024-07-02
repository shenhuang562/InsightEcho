package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:UserRoleResp
 * Package:com.InsightEcho.model.vo.response
 * Description:用户角色Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 上午9:48
 * @Version:v1.0
 */
@Data
@ApiModel(description = "用户角色Response")
public class UserRoleResp {

    /**
     * 角色id
     */
    @ApiModelProperty(value = "角色id")
    private String id;

    /**
     * 角色名
     */
    @ApiModelProperty(value = "角色名")
    private String roleName;
}