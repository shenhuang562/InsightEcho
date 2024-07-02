package com.example.InsightEcho.response;

import lombok.Data;

@Data
public class CategoryResp {

    /**
     * 分类id
     */
    
    private Integer id;

    /**
     * 分类名
     */
    
    private String categoryName;

    /**
     * 文章数量
     */
    
    private Integer articleCount;

}