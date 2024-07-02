package com.InsightEcho.response;

import lombok.Data;

@Data
public class ArticleStatisticsResp {

    /**
     * 日期
     */
    private String date;

    /**
     * 数量
     */
    private Integer count;
}
