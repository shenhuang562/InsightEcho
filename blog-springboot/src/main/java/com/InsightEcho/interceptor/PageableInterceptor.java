package com.InsightEcho.interceptor;

import com.InsightEcho.constant.PageConstant;
import com.InsightEcho.utils.PageUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

/**
 * ClassName:PageableInterceptor
 * Package:com.InsightEcho.interceptor
 * Description:分页拦截器
 *
 * @Author:mind-king
 * @Create:2024/6/26 - 下午9:39
 * @Version:v1.0
 */
public class PageableInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler){
        // 获取请求参数中的当前页码
        String currentPage = request.getParameter(PageConstant.CURRENT);
        // 获取请求参数中的每页条数，如果为空则使用默认值
        String pageSize = Optional.ofNullable(request.getParameter(PageConstant.SIZE))
                .orElse(PageConstant.DEFAULT_SIZE);
        // 如果当前页码存在且非空
        if (StringUtils.hasText(currentPage)){
            // 设置当前页和每页条数到PageUtils中
            PageUtils.setCurrentPage(new Page<>(Long.parseLong(currentPage), Long.parseLong(pageSize)));
        }
        return true;
    }

    @Override
    public void afterCompletion(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response,@NotNull Object handler,Exception ex){
        // 清除 PageUtils 中的分页信息，防止内存泄漏或数据污染。
        PageUtils.remove();
    }

}
