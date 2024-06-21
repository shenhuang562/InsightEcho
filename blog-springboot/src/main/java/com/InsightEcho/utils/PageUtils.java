package main.java.com.InsightEcho.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Objects;

/**
 * ClassName:PageUtils
 * Package:main.java.com.InsightEcho.utils
 * Description:分页工具类
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午8:46
 * @Version:v1.0
 */
public class PageUtils {

    private static final ThreadLocal<Page<?>> PAGE_HOLDER = new ThreadLocal<>();

    public static void setCurrentPage(Page<?> page) {
        PAGE_HOLDER.set(page);
    }

    public static Page<?> getPage() {
        Page<?> page = PAGE_HOLDER.get();
        if (Objects.isNull(page)) {
            setCurrentPage(new Page<>());
        }
        return PAGE_HOLDER.get();
    }

    public static Long getCurrent() {
        // 获取当前线程的 Page 对象的当前页码。
        return getPage().getCurrent();
    }

    public static Long getSize() {
        // 获取当前线程的 Page 对象的页面大小。
        return getPage().getSize();
    }

    public static Long getLimit() {
        // 计算并返回当前页的偏移量，即 (当前页码 - 1) * 页面大小。
        return (getCurrent() - 1) * getSize();
    }

    public static void remove() {
        // 移除当前线程的 Page 对象，清理线程本地变量。
        PAGE_HOLDER.remove();
    }

}
