package com.example.InsightEcho.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArchiveResp {
    /**
     * 文章id
     */
    private Integer id;

    /**
     * 标题
     */
    private String articleTitle;

    /**
     * 文章缩略图
     */
    private String articleCover;

    /**
     * 发表时间
     */
    private LocalDateTime createTime;
}
