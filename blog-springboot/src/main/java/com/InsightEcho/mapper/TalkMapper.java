package com.InsightEcho.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.Talk;
import com.InsightEcho.model.vo.query.PageQuery;
import com.InsightEcho.model.vo.query.TalkQuery;
import com.InsightEcho.model.vo.response.TalkBackInfoResp;
import com.InsightEcho.model.vo.response.TalkBackResp;
import com.InsightEcho.model.vo.response.TalkResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:TalkMapper
 * Package:com.InsightEcho.mapper
 * Description:说说 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:37
 * @Version:v1.0
 */
@Repository
public interface TalkMapper extends BaseMapper<Talk> {

    /**
     * 查询后台说说列表
     *
     * @param talkQuery 说说查询条件
     * @return 后台说说列表
     */
    List<TalkBackResp> selectBackTalkList(@Param("param") TalkQuery talkQuery);

    /**
     * 根据id查询后台说说
     *
     * @param talkId 说说id
     * @return 后台说说
     */
    TalkBackInfoResp selectTalkBackById(@Param("talkId") Integer talkId);

    /**
     * 根据id查询说说
     *
     * @param talkId 说说id
     * @return 说说
     */
    TalkResp selectTalkById(@Param("talkId") Integer talkId);

    /**
     * 查询说说列表
     *
     * @param pageQuery 分页查询条件
     * @return 说说列表
     */
    List<TalkResp> selectTalkList(@Param("param") PageQuery pageQuery);
}