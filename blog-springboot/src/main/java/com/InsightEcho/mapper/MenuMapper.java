package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.Menu;
import com.InsightEcho.query.MenuQuery;
import com.InsightEcho.response.MenuOptionResp;
import com.InsightEcho.response.MenuResp;
import com.InsightEcho.response.MenuTreeResp;
import com.InsightEcho.response.UserMenuResp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据角色id查询对应权限
     *
     * @param roleId id
     * @return 权限标识
     */
    List<String> selectPermissionByRoleId(@Param("roleId") String roleId);

    /**
     * 查询菜单列表
     *
     * @param menuQuery 菜单查询条件
     * @return 菜单列表
     */
    List<MenuResp> selectMenuVOList(@Param("param") MenuQuery menuQuery);

    /**
     * 根据用户id查询用户菜单列表
     *
     * @param userId 用户id
     * @return 用户菜单列表
     */
    List<UserMenuResp> selectMenuByUserId(@Param("userId") Integer userId);

    /**
     * 查询菜单下拉树
     *
     * @return 菜单下拉树
     */
    List<MenuTreeResp> selectMenuTree();

    /**
     * 查询菜单选项树
     *
     * @return 菜单选项树
     */
    List<MenuOptionResp> selectMenuOptions();

    /**
     * 根据id查询菜单信息
     *
     * @param menuId 菜单id
     * @return 菜单
     */
    MenuResp selectMenuById(@Param("menuId") Integer menuId);
}
