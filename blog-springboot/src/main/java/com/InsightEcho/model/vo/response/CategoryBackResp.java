package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
/**
 * ClassName:CategoryBackResp
 * Package:com.InsightEcho.model.vo.response
 * Description:分类后台Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:01
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "分类后台Response")
public class CategoryBackResp extends CategoryResp {

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

}
