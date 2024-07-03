package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
/**
 * ClassName:CategoryReq
 * Package:com.InsightEcho.model.vo.request
 * Description:分类Request
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:58
 * @Version:v1.0
 */
@Data
@ApiModel(description = "分类Request")
public class CategoryReq {

    /**
     * 分类id
     */
    @ApiModelProperty(value = "分类id")
    private Integer id;

    /**
     * 分类名
     */
    @NotBlank(message = "分类名不能为空")
    @ApiModelProperty(value = "分类名", required = true)
    private String categoryName;

}
