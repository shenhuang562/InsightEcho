package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
/**
 * ClassName:UserBackInfoResp
 * Package:com.InsightEcho.model.vo.response
 * Description:后台登录用户信息Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 上午9:49
 * @Version:v1.0
 */
@Data
@Builder
@ApiModel(description = "后台登录用户信息Response")
public class UserBackInfoResp {

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Integer id;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 角色
     */
    @ApiModelProperty(value = "角色")
    private List<String> roleList;

    /**
     * 权限标识
     */
    @ApiModelProperty(value = "权限标识")
    private List<String> permissionList;

}