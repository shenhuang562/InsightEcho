package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:AlbumResp
 * Package:com.InsightEcho.model.vo.response
 * Description:相册Response
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:34
 * @Version:v1.0
 */
@Data
@ApiModel(description = "相册Response")
public class AlbumResp {

    /**
     * 相册id
     */
    @ApiModelProperty(value = "相册id")
    private Integer id;

    /**
     * 相册名
     */
    @ApiModelProperty(value = "相册名")
    private String albumName;

    /**
     * 相册封面
     */
    @ApiModelProperty(value = "相册封面")
    private String albumCover;

    /**
     * 相册描述
     */
    @ApiModelProperty(value = "相册描述")
    private String albumDesc;

}
