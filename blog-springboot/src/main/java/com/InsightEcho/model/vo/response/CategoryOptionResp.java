package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:CategoryOptionResp
 * Package:com.InsightEcho.model.vo.response
 * Description:分类选项Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:50
 * @Version:v1.0
 */
@Data
@ApiModel(description = "分类选项Response")
public class CategoryOptionResp {

    /**
     * 分类id
     */
    @ApiModelProperty(value = "分类id")
    private Integer id;

    /**
     * 分类名
     */
    @ApiModelProperty(value = "分类名")
    private String categoryName;

}