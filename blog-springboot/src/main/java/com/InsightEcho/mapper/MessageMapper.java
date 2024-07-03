package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.Message;
import com.InsightEcho.model.vo.query.MessageQuery;
import com.InsightEcho.model.vo.response.MessageBackResp;
import com.InsightEcho.model.vo.response.MessageResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:MessageMapper
 * Package:com.InsightEcho.mapper
 * Description:留言 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:13
 * @Version:v1.0
 */
@Repository
public interface MessageMapper extends BaseMapper<Message> {

    /**
     * 查询留言列表
     *
     * @return 留言列表
     */
    List<MessageResp> selectMessageVOList();

    /**
     * 查询后台留言列表
     *
     * @param messageQuery 留言查询条件
     * @return 后台留言列表
     */
    List<MessageBackResp> selectBackMessageList(@Param("param") MessageQuery messageQuery);
}
