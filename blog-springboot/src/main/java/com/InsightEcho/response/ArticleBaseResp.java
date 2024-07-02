package com.example.InsightEcho.response;

import lombok.Data;

@Data
public class ArticleBaseResp {
    //文章id
    private Integer id;

    //文章缩略图
    private String articleCover;

    //文章标题
    private String articleTitle;

    //文章内容
    private String articleContent;

    //文章类型（1原创 2转载 3翻译）
    private String articleType;

}
