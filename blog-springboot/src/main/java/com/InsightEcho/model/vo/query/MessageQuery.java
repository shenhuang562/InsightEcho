package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ClassName:MessageQuery
 * Package:com.InsightEcho.model.vo.query
 * Description:留言查询条件
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:47
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "留言查询条件")
public class MessageQuery extends PageQuery {

    /**
     * 搜索内容
     */
    @ApiModelProperty(value = "搜索内容")
    private String keyword;

    /**
     * 是否通过 (0否 1是)
     */
    @ApiModelProperty(value = "是否通过 (0否 1是)")
    private Integer isCheck;

}
