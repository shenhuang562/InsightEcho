package com.InsightEcho.validator;

import com.InsightEcho.model.vo.request.CommentReq;
import com.InsightEcho.validator.groups.ArticleTalk;
import com.InsightEcho.validator.groups.ParentIdNotNull;
import com.InsightEcho.validator.groups.ParentIdNull;
import org.hibernate.validator.spi.group.DefaultGroupSequenceProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.InsightEcho.enums.CommentTypeEnum.*;
/**
 * ClassName:CommentProvider
 * Package:com.InsightEcho.validator
 * Description:评论分组校验器
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:24
 * @Version:v1.0
 */
public class CommentProvider implements DefaultGroupSequenceProvider<CommentReq> {
    @Override
    public List<Class<?>> getValidationGroups(CommentReq commentReq) {
        List<Class<?>> defaultGroupSequence = new ArrayList<>();
        defaultGroupSequence.add(CommentReq.class);
        if (commentReq != null) {
            if (commentReq.getCommentType().equals(ARTICLE.getType()) || commentReq.getCommentType().equals(TALK.getType())) {
                defaultGroupSequence.add(ArticleTalk.class);
            }
            if (Objects.isNull(commentReq.getParentId())) {
                defaultGroupSequence.add(ParentIdNull.class);
            }
            if (Objects.nonNull(commentReq.getParentId())) {
                defaultGroupSequence.add(ParentIdNotNull.class);
            }
        }
        return defaultGroupSequence;
    }
}
