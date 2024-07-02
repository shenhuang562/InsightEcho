package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
/**
 * ClassName:ArticleConditionList
 * Package:com.InsightEcho.model.vo.response
 * Description:文章条件列表VO
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:49
 * @Version:v1.0
 */
@Data
@Builder
@ApiModel(description = "文章条件列表VO")
public class ArticleConditionList {

    /**
     * 文章列表
     */
    @ApiModelProperty(value = "文章列表")
    private List<ArticleConditionResp> articleConditionVOList;

    /**
     * 条件名
     */
    @ApiModelProperty(value = "条件名")
    private String name;
}