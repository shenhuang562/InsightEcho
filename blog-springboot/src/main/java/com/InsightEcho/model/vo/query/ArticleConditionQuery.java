package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ClassName:ArticleConditionQuery
 * Package:com.InsightEcho.model.vo.query
 * Description:文章条件
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:45
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "文章条件")
public class ArticleConditionQuery extends PageQuery {

    /**
     * 分类id
     */
    @ApiModelProperty(value = "分类id", required = true)
    private Integer categoryId;

    /**
     * 标签id
     */
    @ApiModelProperty(value = "标签id", required = true)
    private Integer tagId;

}
