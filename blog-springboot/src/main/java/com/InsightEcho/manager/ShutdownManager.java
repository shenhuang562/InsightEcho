package com.InsightEcho.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
/**
 * ClassName:ShutdownManager
 * Package:com.InsightEcho.manager
 * Description:确保应用退出时能关闭后台线程
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:09
 * @Version:v1.0
 */
@Component
public class ShutdownManager {

    private static final Logger logger = LoggerFactory.getLogger(ShutdownManager.class);

    @PreDestroy
    public void destroy() {
        shutdownAsyncManager();
    }

    /**
     * 停止异步执行任务
     */
    private void shutdownAsyncManager() {
        try {
            logger.info("====关闭后台任务任务线程池====");
            AsyncManager.getInstance().shutdown();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}