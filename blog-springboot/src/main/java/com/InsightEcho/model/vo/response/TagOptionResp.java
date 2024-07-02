package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:TagOptionResp
 * Package:com.InsightEcho.model.vo.response
 * Description:标签选项Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:48
 * @Version:v1.0
 */
@Data
@ApiModel(description = "标签选项Response")
public class TagOptionResp {

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
}