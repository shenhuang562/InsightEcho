package com.example.InsightEcho.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ArticleHomeResp {

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

    /**
     * 文章概要
     */
    
    private String articleDesc;

    /**
     * 文章分类
     */
    
    private CategoryOptionResp category;

    /**
     * 文章标签
     */
    
    private List<TagOptionResp> tagVOList;

    /**
     * 是否置顶 (0否 1是)
     */
    
    private Integer isTop;

    /**
     * 发表时间
     */
    
    private LocalDateTime createTime;
}
