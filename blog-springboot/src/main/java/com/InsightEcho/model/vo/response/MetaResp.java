package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
/**
 * ClassName:MetaResp
 * Package:com.InsightEcho.model.vo.response
 * Description:路由其他信息Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:10
 * @Version:v1.0
 */
@Data
@Builder
@ApiModel(description = "路由其他信息Response")
public class MetaResp {

    /**
     * 菜单名称
     */
    @ApiModelProperty(value = "菜单名称")
    private String title;

    /**
     * 菜单图标
     */
    @ApiModelProperty(value = "菜单图标")
    private String icon;

    /**
     * 是否隐藏
     */
    @ApiModelProperty(value = "是否隐藏")
    private Boolean hidden;

}
