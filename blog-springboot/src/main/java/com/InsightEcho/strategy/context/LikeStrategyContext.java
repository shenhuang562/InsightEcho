package com.InsightEcho.strategy.context;

import com.InsightEcho.enums.LikeTypeEnum;
import com.InsightEcho.strategy.LikeStrategy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * ClassName:LikeStrategyContext
 * Package:com.InsightEcho.strategy.context
 * Description:点赞策略上下文
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:38
 * @Version:v1.0
 */
public class LikeStrategyContext {
    @Autowired
    private Map<String, LikeStrategy> likeStrategyMap;

    /**
     * 点赞
     *
     * @param likeType 点赞类型
     * @param typeId   类型id
     */
    public void executeLikeStrategy(LikeTypeEnum likeType, Integer typeId) {
        likeStrategyMap.get(likeType.getStrategy()).like(typeId);
    }
}
