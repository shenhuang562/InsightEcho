package com.InsightEcho.quartz.execution;

import com.InsightEcho.entity.Task;
import com.InsightEcho.quartz.utils.TaskInvokeUtils;
import org.quartz.JobExecutionContext;
/**
 * ClassName:QuartzJobExecution
 * Package:com.InsightEcho.quartz.execution
 * Description:定时任务处理（允许并发执行）
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午8:24
 * @Version:v1.0
 */
public class QuartzJobExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, Task task) throws Exception {
        TaskInvokeUtils.invokeMethod(task);
    }
}
