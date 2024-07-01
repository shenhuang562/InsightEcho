package com.InsightEcho.strategy;

/**
 * ClassName:LikeStrategy
 * Package:com.InsightEcho.strategy
 * Description:点赞策略
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:40
 * @Version:v1.0
 */

public interface LikeStrategy {

    /**
     * 点赞
     *
     * @param typeId 类型id
     */
    void like(Integer typeId);
}