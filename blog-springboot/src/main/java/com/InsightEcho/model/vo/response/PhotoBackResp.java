package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:PhotoBackResp
 * Package:com.InsightEcho.model.vo.response
 * Description:后台照片Response
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:35
 * @Version:v1.0
 */
@Data
@ApiModel(description = "后台照片Response")
public class PhotoBackResp {

    /**
     * 照片id
     */
    @ApiModelProperty(value = "照片id")
    private Integer id;

    /**
     * 照片名
     */
    @ApiModelProperty(value = "照片名")
    private String photoName;

    /**
     * 照片描述
     */
    @ApiModelProperty(value = "照片描述")
    private String photoDesc;

    /**
     * 照片地址
     */
    @ApiModelProperty(value = "照片地址")
    private String photoUrl;

}
