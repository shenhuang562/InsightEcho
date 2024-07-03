package com.InsightEcho.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ClassName:RoleMenu
 * Package:com.InsightEcho.entity
 * Description:角色菜单
 *
 * @Author:mind-king
 * @Create:2024/6/30 - 下午11:38
 * @Version:v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleMenu {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 菜单id
     */
    private Integer menuId;
}
