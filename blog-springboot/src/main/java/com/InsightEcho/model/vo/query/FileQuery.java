package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ClassName:FileQuery
 * Package:com.InsightEcho.model.vo.query
 * Description: 文件查询条件
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午4:59
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "文件查询条件")
public class FileQuery extends PageQuery {
    /**
     * 文件路径
     */
    @ApiModelProperty(value = "文件路径")
    private String filePath;

}
