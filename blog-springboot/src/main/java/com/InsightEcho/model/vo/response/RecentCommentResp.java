package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
/**
 * ClassName:RecentCommentResp
 * Package:com.InsightEcho.model.vo.response
 * Description:最新评论Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:32
 * @Version:v1.0
 */
@Data
@ApiModel(description = "最新评论Response")
public class RecentCommentResp {

    /**
     * 评论id
     */
    @ApiModelProperty(value = "评论id")
    private Integer id;

    /**
     * 用户昵称
     */
    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    /**
     * 用户头像
     */
    @ApiModelProperty(value = "用户昵称")
    private String avatar;

    /**
     * 评论内容
     */
    @ApiModelProperty(value = "评论内容")
    private String commentContent;

    /**
     * 评论时间
     */
    @ApiModelProperty(value = "评论时间")
    private LocalDateTime createTime;
}