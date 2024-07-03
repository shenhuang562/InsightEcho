package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.TaskLog;
import com.InsightEcho.model.vo.query.TaskQuery;
import com.InsightEcho.model.vo.response.TaskLogResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:TaskLogMapper
 * Package:com.InsightEcho.mapper
 * Description:定时任务日志 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:26
 * @Version:v1.0
 */
@Repository
public interface TaskLogMapper extends BaseMapper<TaskLog> {

    /**
     * 查询定时任务日志数量
     *
     * @param taskQuery 条件
     * @return 定时任务日志数量
     */
    Long selectTaskLogCount(@Param("param") TaskQuery taskQuery);

    /**
     * 查询定时任务日志列表
     *
     * @param taskQuery 条件
     * @return 定时任务日志列表
     */
    List<TaskLogResp> selectTaskLogRespList(@Param("param") TaskQuery taskQuery);

}