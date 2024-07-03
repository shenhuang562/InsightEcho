package com.InsightEcho.mapper;

import com.InsightEcho.entity.Message;
import com.InsightEcho.model.vo.query.MessageQuery;
import com.InsightEcho.model.vo.response.MessageBackResp;
import com.InsightEcho.model.vo.response.MessageResp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
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