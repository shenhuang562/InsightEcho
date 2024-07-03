package com.InsightEcho.model.vo.response;

import lombok.Data;

@Data
public class TagResp {

    /**
     * 标签id
     */
    
    private Integer id;

    /**
     * 标签名
     */
    
    private String tagName;

    /**
     * 文章数量
     */
    
    private Integer articleCount;
}
