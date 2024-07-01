package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.Task;
import com.InsightEcho.model.vo.query.TaskQuery;
import com.InsightEcho.model.vo.response.TaskBackResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:TaskMapper
 * Package:com.InsightEcho.mapper
 * Description:定时任务 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午9:24
 * @Version:v1.0
 */
@Repository
public interface TaskMapper extends BaseMapper<Task> {

    /**
     * 查询定时任务数量
     *
     * @param taskQuery 任务查询条件
     * @return 数量
     */
    Long selectTaskCount(@Param("param") TaskQuery taskQuery);

    /**
     * 查询定时任务列表
     *
     * @param taskQuery 任务查询条件
     * @return 定时任务列表
     */
    List<TaskBackResp> selectTaskList(@Param("param") TaskQuery taskQuery);
}