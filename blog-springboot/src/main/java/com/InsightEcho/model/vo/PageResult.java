package com.InsightEcho.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName:PageResult
 * Package:com.InsightEcho.model.vo
 * Description:分类返回类
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午5:09
 * @Version:v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "分页返回类")
public class PageResult<T> {
    /**
     * 分页结果
     */
    @ApiModelProperty(value = "分页结果")
    private List<T> recordList;

    /**
     * 总数
     */
    @ApiModelProperty(value = "总数", dataType = "long")
    private Long count;

}
