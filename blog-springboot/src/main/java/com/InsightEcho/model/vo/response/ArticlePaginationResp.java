package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:ArticlePaginationResp
 * Package:com.InsightEcho.model.vo.response
 * Description:文章上下篇
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:56
 * @Version:v1.0
 */
@Data
@ApiModel(description = "文章上下篇")
public class ArticlePaginationResp {

    /**
     * 文章id
     */
    @ApiModelProperty(value = "文章id")
    private Integer id;

    /**
     * 文章缩略图
     */
    @ApiModelProperty(value = "文章缩略图")
    private String articleCover;

    /**
     * 文章标题
     */
    @ApiModelProperty(value = "文章标题")
    private String articleTitle;
}
