package main.java.com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:LikeTypeEnum
 * Package:main.java.com.InsightEcho.enums
 * Description:点赞类型枚举
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午10:31
 * @Version:v1.0
 */
@Getter
@AllArgsConstructor
public enum LikeTypeEnum {

    /**
     * 文章
     */
    ARTICLE("文章", "articleLikeStrategyImpl"),

    /**
     * 评论
     */
    COMMENT("评论", "commentLikeStrategyImpl"),

    /**
     * 说说
     */
    TALK("说说", "talkLikeStrategyImpl");

    /**
     * 点赞类型
     */
    private final String likeType;

    /**
     * 策略
     */
    private final String strategy;
}
