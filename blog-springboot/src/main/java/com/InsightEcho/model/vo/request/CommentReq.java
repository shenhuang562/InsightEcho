package com.InsightEcho.model.vo.request;

import com.InsightEcho.annotation.EnumValid;
import com.InsightEcho.validator.CommentProvider;
import com.InsightEcho.validator.groups.ArticleTalk;
import com.InsightEcho.validator.groups.ParentIdNotNull;
import com.InsightEcho.validator.groups.ParentIdNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.group.GroupSequenceProvider;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
/**
 * ClassName:CommentReq
 * Package:com.InsightEcho.model.vo.request
 * Description:评论Request
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:26
 * @Version:v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@GroupSequenceProvider(value = CommentProvider.class)
@ApiModel(description = "评论Request")
public class CommentReq {

    /**
     * 类型id
     */
    @NotNull(message = "类型id不能为空", groups = {ArticleTalk.class})
    @ApiModelProperty(value = "类型id", required = true)
    private Integer typeId;

    /**
     * 评论类型 (1文章 2友链 3说说)
     */
    @EnumValid(values = {1, 2, 3}, message = "评论类型只能为1、2、3")
    @NotNull(message = "评论类型不能为空")
    @ApiModelProperty(value = "评论类型 (1文章 2友链 3说说)", required = true)
    private Integer commentType;

    /**
     * 父评论id
     */
    @Null(groups = {ParentIdNull.class})
    @NotNull(groups = {ParentIdNotNull.class})
    @ApiModelProperty(value = "父评论id", required = true)
    private Integer parentId;

    /**
     * 被回复评论id
     */
    @Null(message = "reply_id、to_uid必须都为空", groups = {ParentIdNull.class})
    @NotNull(message = "回复评论id和回复用户id不能为空", groups = {ParentIdNotNull.class})
    @ApiModelProperty(value = "被回复评论id", required = true)
    private Integer replyId;

    /**
     * 被回复用户id
     */
    @Null(message = "reply_id、to_uid必须都为空", groups = {ParentIdNull.class})
    @NotNull(message = "回复评论id和回复用户id不能为空", groups = {ParentIdNotNull.class})
    @ApiModelProperty(value = "被回复用户id", required = true)
    private Integer toUid;

    /**
     * 评论内容
     */
    @NotBlank(message = "评论内容不能为空")
    @ApiModelProperty(value = "评论内容", required = true)
    private String commentContent;
}
