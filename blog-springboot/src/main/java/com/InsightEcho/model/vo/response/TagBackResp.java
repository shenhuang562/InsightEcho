package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
/**
 * ClassName:TagBackResp
 * Package:com.InsightEcho.model.vo.response
 * Description:标签后台Response
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:11
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "标签后台Response")
public class TagBackResp extends TagResp {

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

}