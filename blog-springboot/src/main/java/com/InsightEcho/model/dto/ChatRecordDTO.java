package com.InsightEcho.model.dto;

import com.InsightEcho.entity.ChatRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
/**
 * ClassName:ChatRecordDTO
 * Package:com.InsightEcho.model.dto
 * Description:聊天记录DTO
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:16
 * @Version:v1.0
 */
@Data
@Builder
@ApiModel(description = "聊天记录DTO")
public class ChatRecordDTO {
    /**
     * 聊天记录
     */
    @ApiModelProperty(value = "聊天记录")
    private List<ChatRecord> chatRecordList;

    /**
     * ip地址
     */
    @ApiModelProperty(value = "ip地址")
    private String ipAddress;

    /**
     * ip来源
     */
    @ApiModelProperty(value = "ip来源")
    private String ipSource;
}
