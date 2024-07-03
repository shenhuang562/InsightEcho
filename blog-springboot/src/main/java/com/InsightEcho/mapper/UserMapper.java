package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.User;
import com.InsightEcho.model.vo.query.UserQuery;
import com.InsightEcho.model.vo.response.UserBackResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:UserMapper
 * Package:com.InsightEcho.mapper
 * Description:用户 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 上午9:42
 * @Version:v1.0
 */
@Repository
public interface UserMapper  extends BaseMapper<User>{

    /**
     * 查询用户后台数量
     *
     * @param userQuery 用户查询条件
     * @return 用户数量
     */
    Long selectUserCount(@Param("param") UserQuery userQuery);

    /**
     * 查询后台用户列表
     *
     * @param userQuery 用户查询条件
     * @return 用户后台列表
     */
    List<UserBackResp> selectUserList(@Param("param") UserQuery userQuery);
}
