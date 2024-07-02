package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
/**
 * ClassName:ArticleRecommendResp
 * Package:com.InsightEcho.model.vo.response
 * Description:推荐文章Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:53
 * @Version:v1.0
 */
@Data
@ApiModel(description = "推荐文章Response")
public class ArticleRecommendResp {

    /**
     * 文章id
     */
    @ApiModelProperty(value = "文章id")
    private Integer id;

    /**
     * 文章标题
     */
    @ApiModelProperty(value = "文章标题")
    private String articleTitle;

    /**
     * 文章缩略图
     */
    @ApiModelProperty(value = "文章缩略图")
    private String articleCover;

    /**
     * 发布时间
     */
    @ApiModelProperty(value = "发布时间")
    private LocalDateTime createTime;
}
