package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName:CarouselResp
 * Package:com.InsightEcho.model.vo.response
 * Description:轮播图Response
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午9:17
 * @Version:v1.0
 */
@Data
@ApiModel(value = "轮播图Response")
public class CarouselResp {

    /**
     * 轮播图id
     */
    @ApiModelProperty(value = "轮播图id")
    private Integer id;

    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址")
    private String imgUrl;

}