package com.InsightEcho.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * ClassName:ThreadUtils
 * Package:main.java.com.InsightEcho.utils
 * Description:线程工具类
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午9:10
 * @Version:v1.0
 */
/*
线程工具类
 */
public class ThreadUtils {

    private static final Logger logger = LoggerFactory.getLogger(ThreadUtils.class);

    private static final long OVERTIME = 120;

    /*
    停止线程池
    先使用shutdown，停止接收新任务并尝试完成所有已存在任务,
    如果超时，则调用shutdownNow，取消在workQueue中Pending的任务，并中断所有阻塞函数，
    如果仍然超时，则强制退出，
    另对在shutdown时线程本身被调用中断做了处理

    @param pool 要关闭的线程池
     */
    public static void shutdownAndAwaitTermination(ExecutorService pool) {
        if (pool != null && !pool.isShutdown()) {
            logger.info("Initiating shutdown of thread pool");
            pool.shutdown();
            try {
                if (!pool.awaitTermination(OVERTIME, TimeUnit.SECONDS)) {
                    logger.warn("Thread pool did not terminate in {} seconds, initiating shutdownNow", OVERTIME);
                    pool.shutdownNow();
                    if (!pool.awaitTermination(OVERTIME, TimeUnit.SECONDS)) {
                        logger.error("Pool did not terminate");
                    }
                }
            } catch (InterruptedException ie) {
                logger.error("Thread interrupted during shutdown, initiating shutdownNow", ie);
                pool.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    /*
    打印线程异常信息
    @param r 发生异常的任务
    @param t 捕获的异常
     */
    public static void printException(Runnable r, Throwable t) {
        if (t == null && r instanceof Future<?>) {
            try {
                Future<?> future = (Future<?>) r;
                if (future.isDone()) {
                    future.get();
                }
            } catch (CancellationException ce) {
                t = ce;
            } catch (ExecutionException ee) {
                t = ee.getCause();
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
        if (t != null) {
            logger.error("Exception in thread execution: {}", t.getMessage(), t);
        }
    }
}
