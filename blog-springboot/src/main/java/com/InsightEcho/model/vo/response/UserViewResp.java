package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:UserViewResp
 * Package:com.InsightEcho.model.vo.response
 * Description:用户浏览Response
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:07
 * @Version:v1.0
 */
@Data
@ApiModel(description = "用户浏览Response")
public class UserViewResp {

    /**
     * 日期
     */
    @ApiModelProperty(value = "日期")
    private String date;

    /**
     * pv
     */
    @ApiModelProperty(value = "pv")
    private Integer pv;

    /**
     * uv
     */
    @ApiModelProperty(value = "uv")
    private Integer uv;
}