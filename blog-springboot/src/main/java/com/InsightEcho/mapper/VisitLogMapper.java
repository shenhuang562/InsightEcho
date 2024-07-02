package com.InsightEcho.mapper;

import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.VisitLog;
import com.InsightEcho.model.vo.query.LogQuery;
import com.InsightEcho.model.vo.response.UserViewResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:VisitLogMapper
 * Package:com.InsightEcho.mapper
 * Description:访问日志Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:06
 * @Version:v1.0
 */
@Repository
public interface VisitLogMapper extends BaseMapper<VisitLog> {

    /**
     * 查询访问日志
     *
     * @param logQuery 访问日志查询条件
     * @return 访问日志列表
     */
    List<VisitLog> selectVisitLogList(@Param("param") LogQuery logQuery);

    /**
     * 获取7天用户访问结果
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return 用户访问结果
     */
    List<UserViewResp> selectUserViewList(@Param("startTime") DateTime startTime, @Param("endTime") DateTime endTime);

    /**
     * 清除一周前的访问日志
     *
     * @param endTime 结束时间
     */
    void deleteVisitLog(@Param("endTime") DateTime endTime);
}