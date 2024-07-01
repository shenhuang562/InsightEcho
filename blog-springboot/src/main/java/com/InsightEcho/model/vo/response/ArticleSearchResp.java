package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
/**
 * ClassName:ArticleSearchResp
 * Package:com.InsightEcho.model.vo.response
 * Description:文章归档Response
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:46
 * @Version:v1.0
 */
@Data
@ApiModel(description = "文章归档Response")
public class ArticleSearchResp {
    /**
     * 文章id
     */
    @ApiModelProperty(value = "文章id")
    private Integer id;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    private String articleTitle;

    /**
     * 文章缩略图
     */
    @ApiModelProperty(value = "文章缩略图")
    private String articleCover;

    /**
     * 发表时间
     */
    @ApiModelProperty(value = "发表时间")
    private LocalDateTime createTime;
}
