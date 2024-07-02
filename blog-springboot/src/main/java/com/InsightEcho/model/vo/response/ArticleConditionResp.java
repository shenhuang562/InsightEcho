package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
/**
 * ClassName:ArticleConditionResp
 * Package:com.InsightEcho.model.vo.response
 * Description:文章条件Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:50
 * @Version:v1.0
 */
@Data
@ApiModel(description = "文章条件Response")
public class ArticleConditionResp {

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

    /**
     * 文章分类
     */
    @ApiModelProperty(value = "文章分类")
    private CategoryOptionResp category;

    /**
     * 文章标签
     */
    @ApiModelProperty(value = "文章标签")
    private List<TagOptionResp> tagVOList;

    /**
     * 发表时间
     */
    @ApiModelProperty(value = "发表时间")
    private LocalDateTime createTime;

}
