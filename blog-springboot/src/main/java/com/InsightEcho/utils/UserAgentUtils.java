package com.InsightEcho.utils;

import nl.basjes.parse.useragent.UserAgent;
import nl.basjes.parse.useragent.UserAgentAnalyzer;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: UserAgentUtils
 * Package: main.java.com.InsightEcho.utils
 * Description: 浏览器工具类，用于解析User-Agent字符串获取操作系统和浏览器信息
 *
 * @Author: mind-king
 * @Create: 2024/6/21 - 上午9:30
 * @Version: v1.0
 */
public class UserAgentUtils {

    private static final UserAgentAnalyzer USER_AGENT_ANALYZER;

    static {
        USER_AGENT_ANALYZER = UserAgentAnalyzer
                .newBuilder()
                .hideMatcherLoadStats()
                .withField(UserAgent.OPERATING_SYSTEM_NAME_VERSION_MAJOR)
                .withField(UserAgent.AGENT_NAME_VERSION)
                .build();
    }

    /**
     * 从User-Agent解析客户端操作系统和浏览器版本
     *
     * @param userAgent 用户代理字符串
     * @return 包含操作系统和浏览器版本信息的 Map
     */
    public static Map<String, String> parseOsAndBrowser(String userAgent) {
        Map<String, String> map = new HashMap<>(2);
        try {
            UserAgent agent = USER_AGENT_ANALYZER.parse(userAgent);
            String os = agent.getValue(UserAgent.OPERATING_SYSTEM_NAME_VERSION_MAJOR);
            String browser = agent.getValue(UserAgent.AGENT_NAME_VERSION);
            map.put("os", os);
            map.put("browser", browser);
        } catch (Exception e) {
            // 在这里可以根据需要处理解析失败的情况，例如记录日志
            System.err.println("Failed to parse User-Agent string: " + e.getMessage());
        }
        return map;
    }
}
