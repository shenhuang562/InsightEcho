package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.ExceptionLog;
import com.InsightEcho.model.vo.query.LogQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:ExceptionLogMapper
 * Package:com.InsightEcho.mapper
 * Description:异常日志Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午7:58
 * @Version:v1.0
 */
@Repository
public interface ExceptionLogMapper extends BaseMapper<ExceptionLog> {

    /**
     * 查询异常日志
     *
     * @param logQuery 异常日志查询条件
     * @return 异常日志列表
     */
    List<ExceptionLog> selectExceptionLogList(@Param("param") LogQuery logQuery);
}
