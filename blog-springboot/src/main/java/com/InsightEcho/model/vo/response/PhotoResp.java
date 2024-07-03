package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:PhotoResp
 * Package:com.InsightEcho.model.vo.response
 * Description:照片Response
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:36
 * @Version:v1.0
 */
@Data
@ApiModel(description = "照片Response")
public class PhotoResp {

    /**
     * 照片id
     */
    @ApiModelProperty(value = "照片id")
    private Integer id;

    /**
     * 照片链接
     */
    @ApiModelProperty(value = "照片链接")
    private String photoUrl;

}