package com.InsightEcho.model.dto;

import lombok.Data;
/**
 * ClassName:QqUserInfoDTO
 * Package:com.InsightEcho.model.dto
 * Description:QQ用户信息
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 上午12:03
 * @Version:v1.0
 */
@Data
public class QqUserInfoDTO {

    /**
     * 用户开放id
     */
    private String openId;

    /**
     * QQ头像
     */
    private String figureurl_qq_1;

    /**
     * 昵称
     */
    private String nickname;
}
