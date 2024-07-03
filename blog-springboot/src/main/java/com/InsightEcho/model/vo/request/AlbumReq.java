package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
/**
 * ClassName:AlbumReq
 * Package:com.InsightEcho.model.vo.request
 * Description:相册Request
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:51
 * @Version:v1.0
 */
@Data
@ApiModel(description = "相册Request")
public class AlbumReq {

    /**
     * 相册id
     */
    @ApiModelProperty(value = "相册id")
    private Integer id;

    /**
     * 相册名
     */
    @NotBlank(message = "相册名不能为空")
    @ApiModelProperty(value = "相册名", required = true)
    private String albumName;

    /**
     * 相册描述
     */
    @ApiModelProperty(value = "相册描述")
    private String albumDesc;

    /**
     * 相册封面
     */
    @NotBlank(message = "相册封面不能为空")
    @ApiModelProperty(value = "相册封面", required = true)
    private String albumCover;

    /**
     * 状态 (1公开 2私密)
     */
    @ApiModelProperty(value = "状态 (1公开 2私密)")
    private Integer status;
}