package com.InsightEcho.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ClassName:WebsocketMessageDTO
 * Package:com.InsightEcho.model.dto
 * Description:
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:08
 * @Version:v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsocketMessageDTO {
    /**
     * 类型
     */
    private Integer type;

    /**
     * 数据
     */
    private Object data;
}
