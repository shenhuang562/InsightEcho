package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:TagResp
 * Package:com.InsightEcho.model.vo.response
 * Description: 标签Response
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:12
 * @Version:v1.0
 */
@Data
@ApiModel(description = "标签Response")
public class TagResp {

    /**
     * 标签id
     */
    @ApiModelProperty(value = "标签id")
    private Integer id;

    /**
     * 标签名
     */
    @ApiModelProperty(value = "标签名")
    private String tagName;

    /**
     * 文章数量
     */
    @ApiModelProperty(value = "文章数量")
    private Integer articleCount;
}