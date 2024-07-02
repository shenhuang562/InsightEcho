package com.example.InsightEcho.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ArticleConditionQuery extends PageQuery{
    //分类id
    private Integer categoryId;

    //标签id
    private Integer tagId;
}
