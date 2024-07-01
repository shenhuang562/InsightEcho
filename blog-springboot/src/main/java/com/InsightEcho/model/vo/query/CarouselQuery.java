package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ClassName:CarouselQuery
 * Package:com.InsightEcho.model.vo.query
 * Description:轮播图查询条件
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:10
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "轮播图查询条件")
public class CarouselQuery extends PageQuery{
    /**
     * 是否显示 (0否 1是)
     */
    @ApiModelProperty(value = "是否显示 (0否 1是)")
    private Integer status;
}
