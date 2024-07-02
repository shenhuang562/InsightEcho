package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.UserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:UserRoleMapper
 * Package:com.InsightEcho.mapper
 * Description:用户角色 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:38
 * @Version:v1.0
 */
@Repository
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * 根据用户id查询角色id
     *
     * @param userId 用户id
     * @return 角色id
     */
    List<String> selectRoleIdByUserId(@Param("userId") Integer userId);

    /**
     * 添加用户角色
     *
     * @param userId     用户id
     * @param roleIdList 角色id集合
     */
    void insertUserRole(@Param("userId") Integer userId, @Param("roleIdList") List<String> roleIdList);
}
