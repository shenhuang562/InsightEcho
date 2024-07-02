package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:ArticleStatisticsResp
 * Package:com.InsightEcho.model.vo.response
 * Description:文章贡献统计Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:58
 * @Version:v1.0
 */
@Data
@ApiModel(description = "文章贡献统计Response")
public class ArticleStatisticsResp {

    /**
     * 日期
     */
    @ApiModelProperty(value = "日期")
    private String date;

    /**
     * 数量
     */
    @ApiModelProperty(value = "数量")
    private Integer count;
}