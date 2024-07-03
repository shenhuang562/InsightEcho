package com.InsightEcho.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.InsightEcho.entity.TaskLog;
import com.InsightEcho.mapper.TaskLogMapper;
import com.InsightEcho.model.vo.PageResult;
import com.InsightEcho.model.vo.query.TaskQuery;
import com.InsightEcho.model.vo.response.TaskLogResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * ClassName:TaskLogService
 * Package:com.InsightEcho.service
 * Description:定时任务日志服务
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:59
 * @Version:v1.0
 */
@Service
public class TaskLogService extends ServiceImpl<TaskLogMapper, TaskLog> {

    @Autowired
    private TaskLogMapper taskLogMapper;

    public PageResult<TaskLogResp> listTaskLog(TaskQuery taskQuery) {
        // 查询定时任务日志数量
        Long count = taskLogMapper.selectTaskLogCount(taskQuery);
        if (count == 0) {
            return new PageResult<>();
        }
        // 查询定时任务日志列表
        List<TaskLogResp> taskLogRespList = taskLogMapper.selectTaskLogRespList(taskQuery);
        return new PageResult<>(taskLogRespList, count);
    }

    public void clearTaskLog() {
        taskLogMapper.delete(null);
    }
}
