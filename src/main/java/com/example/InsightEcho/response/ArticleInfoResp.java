package com.example.InsightEcho.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ArticleInfoResp extends ArticleBaseResp {
    //是否删除（0否 1是）
    private Integer isDelete;

    //文章状态(1私密 2公开 3草稿)
    private Integer status;

    //文章概要
    private String articleDesc;

    //点赞量
    private Integer likeCount;

    //浏览量
    private Integer viewCount;

    //文章标签
    private List<TagOptionResp> tagVOList;

    //文章分类
    private String categoryName;

    //发表时间
    private LocalDateTime createTime;
}
