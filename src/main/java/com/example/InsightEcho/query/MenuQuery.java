package com.example.InsightEcho.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 菜单查询条件
 *
 * @author ican
 * @date 2023/07/29 17:57
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class MenuQuery extends PageQuery {

    /**
     * 搜索内容
     */
    private String keyword;

    /**
     * 是否禁用 (0否 1是)
     */

    private Integer isDisable;

}
