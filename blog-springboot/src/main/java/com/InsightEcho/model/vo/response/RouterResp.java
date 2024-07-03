package com.InsightEcho.model.vo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 * ClassName:RouteResp
 * Package:com.InsightEcho.model.vo.response
 * Description:路由Response
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午10:05
 * @Version:v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "路由Response")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RouterResp {

    /**
     * 菜单名称
     */
    @ApiModelProperty(value = "菜单名称")
    private String name;

    /**
     * 路由地址
     */
    @ApiModelProperty(value = "路由地址")
    private String path;

    /**
     * 菜单组件
     */
    @ApiModelProperty(value = "菜单组件")
    private String component;

    /**
     * 路由下面的 children 声明的路由大于1个时，自动会变成嵌套的模式--如组件页面
     */
    private Boolean alwaysShow;

    /**
     * 重定向地址
     */
    @ApiModelProperty(value = "重定向地址")
    private String redirect;

    /**
     * 其他信息
     */
    @ApiModelProperty(value = "其他信息")
    private MetaResp meta;

    /**
     * 子菜单列表
     */
    @ApiModelProperty(value = "子菜单列表")
    private List<RouterResp> children;
}
