package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.ChatRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
/**
 * ClassName:ChatRecordMapper
 * Package:com.InsightEcho.mapper
 * Description:聊天记录Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:15
 * @Version:v1.0
 */
@Mapper
public interface ChatRecordMapper  extends BaseMapper<ChatRecord>{
}
