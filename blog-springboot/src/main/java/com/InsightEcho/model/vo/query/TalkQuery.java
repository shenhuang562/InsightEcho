package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ClassName:TalkQuery
 * Package:com.InsightEcho.model.vo.query
 * Description:说说查询条件
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:39
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "说说查询条件")
public class TalkQuery extends PageQuery {

    /**
     * 状态 (1公开  2私密)
     */
    @ApiModelProperty(value = "状态 (1公开  2私密)")
    private Integer status;

}