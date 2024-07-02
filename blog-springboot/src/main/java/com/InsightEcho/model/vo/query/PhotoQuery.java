package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ClassName:PhotoQuery
 * Package:com.InsightEcho.model.vo.query
 * Description:照片查询条件
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:49
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "照片查询条件")
public class PhotoQuery extends PageQuery {

    /**
     * 搜索内容
     */
    @ApiModelProperty(value = "搜索内容")
    private String keyword;

    /**
     * 相册id
     */
    @ApiModelProperty(value = "相册id")
    private Integer albumId;

}