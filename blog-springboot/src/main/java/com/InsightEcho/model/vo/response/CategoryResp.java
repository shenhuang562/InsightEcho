package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:CategoryResp
 * Package:com.InsightEcho.model.vo.response
 * Description:分类Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:00
 * @Version:v1.0
 */
@Data
@ApiModel(description = "分类Response")
public class CategoryResp {

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

    /**
     * 文章数量
     */
    @ApiModelProperty(value = "文章数量")
    private Integer articleCount;

}
