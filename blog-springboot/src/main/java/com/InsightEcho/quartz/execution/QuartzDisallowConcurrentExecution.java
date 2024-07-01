package com.InsightEcho.quartz.execution;


import com.InsightEcho.entity.Task;
import com.InsightEcho.quartz.utils.TaskInvokeUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;

/**
 * ClassName:QuartzDisallowConcurrentExecution
 * Package:com.InsightEcho.quartz.execution
 * Description: 定时任务处理（禁止并发执行）
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:23
 * @Version:v1.0
 */
@DisallowConcurrentExecution
public class QuartzDisallowConcurrentExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, Task task) throws Exception {
        TaskInvokeUtils.invokeMethod(task);
    }
}