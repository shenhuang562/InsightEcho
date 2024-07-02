package com.InsightEcho.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.InsightEcho.entity.OperationLog;
import com.InsightEcho.mapper.OperationLogMapper;
import com.InsightEcho.model.vo.PageResult;
import com.InsightEcho.model.vo.query.LogQuery;
import com.InsightEcho.model.vo.response.OperationLogResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ClassName:OperationLogService
 * Package:com.InsightEcho.service
 * Description:操作日志业务接口实现类
 *
 * @Author:mind-king
 * @Create:2024/6/30 - 下午11:56
 * @Version:v1.0
 */
@Service
public class OperationLogService extends ServiceImpl<OperationLogMapper, OperationLog> {

    @Autowired
    private OperationLogMapper operationLogMapper;

    public PageResult<OperationLogResp> listOperationLogVO(LogQuery logQuery) {
        // 查询操作日志数量
        Long count = operationLogMapper.selectCount(new LambdaQueryWrapper<OperationLog>()
                .like(StringUtils.hasText(logQuery.getOptModule()), OperationLog::getModule, logQuery.getOptModule())
                .or()
                .like(StringUtils.hasText(logQuery.getKeyword()), OperationLog::getDescription, logQuery.getKeyword())
        );
        if (count == 0) {
            return new PageResult<>();
        }
        // 查询操作日志列表
        List<OperationLogResp> operationLogRespList = operationLogMapper.selectOperationLogVOList(logQuery);
        return new PageResult<>(operationLogRespList, count);
    }

    public void saveOperationLog(OperationLog operationLog) {
        // 保存操作日志
        operationLogMapper.insert(operationLog);
    }

}