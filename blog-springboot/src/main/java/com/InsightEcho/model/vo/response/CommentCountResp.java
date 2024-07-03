package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:CommentCountResp
 * Package:com.InsightEcho.model.vo.response
 * Description:评论数量Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:04
 * @Version:v1.0
 */
@Data
@ApiModel(description = "评论数量Response")
public class CommentCountResp {
    /**
     * 类型id
     */
    @ApiModelProperty(value = "类型id")
    private Integer id;

    /**
     * 评论数量
     */
    @ApiModelProperty(value = "评论数量")
    private Integer commentCount;
}