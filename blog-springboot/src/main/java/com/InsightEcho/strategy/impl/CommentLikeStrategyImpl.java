package com.InsightEcho.strategy.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.InsightEcho.constant.CommonConstant;
import com.InsightEcho.constant.RedisConstant;
import com.InsightEcho.entity.Comment;
import com.InsightEcho.mapper.CommentMapper;
import com.InsightEcho.service.RedisService;
import com.InsightEcho.strategy.LikeStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
/**
 * ClassName:CommentLikeStrategyImpl
 * Package:com.InsightEcho.strategy.impl
 * Description:评论点赞策略
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:26
 * @Version:v1.0
 */
@Service("commentLikeStrategyImpl")
public class CommentLikeStrategyImpl implements LikeStrategy {

    @Autowired
    private RedisService redisService;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void like(Integer commentId) {
        // 判断评论是否存在或是否通过或是否进入回收站
        Comment comment = commentMapper.selectOne(new LambdaQueryWrapper<Comment>()
                .select(Comment::getId, Comment::getIsCheck)
                .eq(Comment::getId, commentId).last("limit 1"));
        Assert.isFalse(Objects.isNull(comment) || comment.getIsCheck().equals(CommonConstant.FALSE), "文章不存在");
        // 用户id作为键，评论id作为值，记录用户点赞记录
        String userLikeCommentKey = RedisConstant.USER_COMMENT_LIKE + StpUtil.getLoginIdAsInt();
        if (redisService.hasSetValue(userLikeCommentKey, commentId)) {
            // 取消点赞则删除用户id中的评论id
            redisService.deleteSet(userLikeCommentKey, commentId);
            // 评论点赞量-1
            redisService.decrHash(RedisConstant.COMMENT_LIKE_COUNT, commentId.toString(), 1L);
        } else {
            // 点赞则在用户id记录评论id
            redisService.setSet(userLikeCommentKey, commentId);
            // 评论点赞量+1
            redisService.incrHash(RedisConstant.COMMENT_LIKE_COUNT, commentId.toString(), 1L);
        }
    }
}
