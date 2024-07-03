package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.Role;
import com.InsightEcho.model.vo.query.RoleQuery;
import com.InsightEcho.model.vo.response.RoleResp;
import com.InsightEcho.model.vo.response.UserRoleResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:RoleMapper
 * Package:com.InsightEcho.mapper
 * Description:角色 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 上午10:07
 * @Version:v1.0
 */
@Repository
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询用户角色
     *
     * @param userId 用户id
     * @return 角色
     */
    List<String> selectRoleListByUserId(@Param("userId") Object userId);

    /**
     * 查询后台角色数量
     *
     * @param roleQuery 角色查询条件
     * @return 后台角色数量
     */
    Long selectBackRoleCount(@Param("param") RoleQuery roleQuery);

    /**
     * 查询后台角色列表
     *
     * @param roleQuery 角色查询条件
     * @return 后台角色列表
     */
    List<RoleResp> selectBackRoleList(@Param("param") RoleQuery roleQuery);

    /**
     * 查询用户角色选项
     *
     * @return 用户角色选项
     */
    List<UserRoleResp> selectUserRoleList();
}