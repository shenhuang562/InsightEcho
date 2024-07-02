package com.InsightEcho.strategy;

import com.InsightEcho.model.vo.request.CodeReq;
/**
 * ClassName:SocialLoginStrategy
 * Package:com.InsightEcho.strategy
 * Description:第三方登录策略
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:32
 * @Version:v1.0
 */
public interface SocialLoginStrategy {
    /**
     * 登录
     *
     * @param data 第三方code
     * @return {@link String} Token
     */
    String login(CodeReq data);
}
