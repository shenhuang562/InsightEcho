package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ClassName:MenuQuery
 * Package:com.InsightEcho.model.vo.query
 * Description:菜单查询条件
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 上午10:01
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "菜单查询条件")
public class MenuQuery extends PageQuery {

    /**
     * 搜索内容
     */
    @ApiModelProperty(value = "搜索内容")
    private String keyword;

    /**
     * 是否禁用 (0否 1是)
     */
    @ApiModelProperty(value = "是否禁用 (0否 1是)")
    private Integer isDisable;

}
