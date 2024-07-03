package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
/**
 * ClassName:ArticleRankResp
 * Package:com.InsightEcho.model.vo.response
 * Description:文章浏览量排行Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:57
 * @Version:v1.0
 */
@Data
@Builder
@ApiModel(description = "文章浏览量排行Response")
public class ArticleRankResp {

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    private String articleTitle;

    /**
     * 浏览量
     */
    @ApiModelProperty(value = "浏览量")
    private Integer viewCount;

}
