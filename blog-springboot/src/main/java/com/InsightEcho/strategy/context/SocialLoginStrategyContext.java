package com.InsightEcho.strategy.context;

import com.InsightEcho.enums.LoginTypeEnum;
import com.InsightEcho.model.vo.request.CodeReq;
import com.InsightEcho.strategy.SocialLoginStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
/**
 * ClassName:SocialLoginStrategyContext
 * Package:com.InsightEcho.strategy.context
 * Description:登录策略上下文
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:29
 * @Version:v1.0
 */
@Service
public class SocialLoginStrategyContext {

    @Autowired
    private Map<String, SocialLoginStrategy> socialLoginStrategyMap;

    /**
     * 登录
     *
     * @param data          data
     * @param loginTypeEnum 登录枚举
     * @return {@link String} Token
     */
    public String executeLoginStrategy(CodeReq data, LoginTypeEnum loginTypeEnum) {
        return socialLoginStrategyMap.get(loginTypeEnum.getStrategy()).login(data);
    }
}
