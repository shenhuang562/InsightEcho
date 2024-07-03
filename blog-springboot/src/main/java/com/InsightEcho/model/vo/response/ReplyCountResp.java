package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:ReplyCountResp
 * Package:com.InsightEcho.model.vo.response
 * Description:回复数Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:32
 * @Version:v1.0
 */
@Data
@ApiModel(description = "回复数Response")
public class ReplyCountResp {

    /**
     * 评论id
     */
    @ApiModelProperty(value = "评论id")
    private Integer commentId;

    /**
     * 回复数
     */
    @ApiModelProperty(value = "回复数")
    private Integer replyCount;

}
