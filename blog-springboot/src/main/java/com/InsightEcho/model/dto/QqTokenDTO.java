package com.InsightEcho.model.dto;

import lombok.Data;
/**
 * ClassName:QqTokenDTO
 * Package:com.InsightEcho.model.dto
 * Description:QQ token信息
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:01
 * @Version:v1.0
 */
@Data
public class QqTokenDTO {

    /**
     * openid
     */
    private String openid;

    /**
     * 客户端id
     */
    private String client_id;
}
