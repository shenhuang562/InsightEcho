package com.example.InsightEcho.response;

import lombok.Data;

@Data
public class ArticlePaginationResp {

    /**
     * 文章id
     */
    
    private Integer id;

    /**
     * 文章缩略图
     */
    
    private String articleCover;

    /**
     * 文章标题
     */
    
    private String articleTitle;
}