package com.example.InsightEcho.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;


@Data
public class MenuTreeResp {

    /**
     * 菜单id
     */

    private Integer id;

    /**
     * 父菜单id
     */
    @JsonIgnore
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String label;

    /**
     * 子菜单树
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MenuTreeResp> children;
}
