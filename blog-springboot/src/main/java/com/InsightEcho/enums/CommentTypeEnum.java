package com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName: CommentTypeEnum
 * Package: main.java.com.InsightEcho.enums
 * Description: 评论类型枚举
 *
 * @Author: mind-king
 * @Create: 2024/6/21 - 上午10:10
 * @Version: v1.0
 */
@Getter
@AllArgsConstructor
public enum CommentTypeEnum {
    /**
     * 文章评论
     */
    ARTICLE(1, "文章", "article/"),
    /**
     * 友链评论
     */
    LINK(2, "友链", "friend"),
    /**
     * 说说评论
     */
    TALK(3, "说说", "talk/");

    /**
     * 类型
     */
    private final Integer type;

    /**
     * 描述
     */
    private final String description;

    /**
     * 路径
     */
    private final String path;

    /**
     * 获取评论路径
     *
     * @param type 类型
     * @return 对应类型的路径 {@link String}
     */
    public static String getCommentPath(Integer type) {
        if (type == null) {
            return null;
        }
        for (CommentTypeEnum value : values()) {
            if (value.getType().equals(type)) {
                return value.getPath();
            }
        }
        return null;
    }
}
