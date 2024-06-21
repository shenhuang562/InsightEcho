package main.java.com.InsightEcho.utils;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName:WebUtils
 * Package:main.java.com.InsightEcho.utils
 * Description: Web工具类，包含用于向客户端渲染响应的方法
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午9:44
 * @Version:v1.0
 */
@Slf4j
public class WebUtils {
    /*
    将字符串渲染到客户端
    @param response 渲染对象
    @param string 待渲染的字符串
     */
    public static void renderString(HttpServletResponse response, String string) {
        try {
            response.setStatus(200);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            PrintWriter writer = response.getWriter();
            writer.print(string);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            log.error("renderString is error, {}", e.getMessage());
        }
    }

}
