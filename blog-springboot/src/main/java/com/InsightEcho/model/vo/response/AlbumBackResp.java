package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ClassName:AlbumBackResp
 * Package:com.InsightEcho.model.vo.response
 * Description:相册后台Response
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:33
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "相册后台Response")
public class AlbumBackResp extends AlbumResp {

    /**
     * 状态 (1公开 2私密)
     */
    @ApiModelProperty(value = "状态 (1公开 2私密)")
    private Integer status;

    /**
     * 照片数量
     */
    @ApiModelProperty(value = "照片数量")
    private Long photoCount;

}