package com.example.InsightEcho.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleSearchResp {

    /**
     * 文章id
     */
    
    private Integer id;

    /**
     * 文章标题
     */
    
    private String articleTitle;

    /**
     * 文章内容
     */
    
    private String articleContent;

    /**
     * 是否删除
     */
    
    private Integer isDelete;

    /**
     * 文章状态
     */
    
    private Integer status;
}
