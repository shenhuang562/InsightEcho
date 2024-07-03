package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.OperationLog;
import com.InsightEcho.model.vo.query.LogQuery;
import com.InsightEcho.model.vo.response.OperationLogResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:OperationLogMapper
 * Package:com.InsightEcho.mapper
 * Description:操作日志 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:01
 * @Version:v1.0
 */
@Repository
public interface OperationLogMapper extends BaseMapper<OperationLog> {

    /**
     * 查询操作日志
     *
     * @param logQuery 条件
     * @return 操作日志列表
     */
    List<OperationLogResp> selectOperationLogVOList(@Param("param") LogQuery logQuery);

}