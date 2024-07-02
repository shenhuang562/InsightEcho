package com.InsightEcho.model.vo.response;

import com.InsightEcho.entity.SiteConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ClassName:BlogInfoResp
 * Package:com.InsightEcho.model.vo.response
 * Description:博客信息Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:00
 * @Version:v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "博客信息Response")
public class BlogInfoResp {

    /**
     * 文章数量
     */
    @ApiModelProperty(value = "文章数量")
    private Long articleCount;

    /**
     * 分类数量
     */
    @ApiModelProperty(value = "分类数量")
    private Long categoryCount;

    /**
     * 标签数量
     */
    @ApiModelProperty(value = "标签数量")
    private Long tagCount;

    /**
     * 网站访问量
     */
    @ApiModelProperty(value = "网站访问量")
    private String viewCount;

    /**
     * 网站配置
     */
    @ApiModelProperty(value = "网站配置")
    private SiteConfig siteConfig;

}