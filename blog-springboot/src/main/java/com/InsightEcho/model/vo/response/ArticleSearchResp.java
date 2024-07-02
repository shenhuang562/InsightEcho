package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ClassName:ArticleSearchResp
 * Package:com.InsightEcho.model.vo.response
 * Description:文章搜索Response
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:46
 * @Version:v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "文章搜索Response")
public class ArticleSearchResp {
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
     * 文章内容
     */
    @ApiModelProperty(value = "文章内容")
    private String articleContent;

    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除")
    private Integer isDelete;

    /**
     * 文章状态
     */
    @ApiModelProperty(value = "文章状态")
    private Integer status;
}
