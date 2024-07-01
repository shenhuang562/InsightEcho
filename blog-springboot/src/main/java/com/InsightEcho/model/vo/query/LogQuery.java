package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ClassName:LogQuery
 * Package:com.InsightEcho.model.vo.query
 * Description:日志查询条件
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午5:01
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "日志查询条件")
public class LogQuery extends PageQuery {
    /**
     * 搜索内容
     */
    @ApiModelProperty(value = "搜索内容")
    private String keyword;

    /**
     * 操作模块
     */
    @ApiModelProperty(value = "操作模块")
    private String optModule;
}
