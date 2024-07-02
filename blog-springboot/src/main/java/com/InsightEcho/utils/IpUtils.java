package com.InsightEcho.utils;

import org.lionsoul.ip2region.xdb.Searcher;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: IpUtils
 * Package: main.java.com.InsightEcho.utils
 * Description:IP地址工具类
 *
 * @Author: mind-king
 * @Create: 2024/6/19 - 下午8:58
 * @Version: v1.0
 */
@SuppressWarnings("all")
public class IpUtils {
    private static final String UNKNOWN = "unknown";
    private static final String LOCALHOST_IPV4 = "127.0.0.1";
    private static final String LOCALHOST_IPV6 = "0:0:0:0:0:0:0:1";
    private static final int MAX_IP_LENGTH = 15;
    private static Searcher searcher;

    static {
        // 解决项目打包找不到 ip2region.xdb
        try {
            InputStream inputStream = new ClassPathResource("/ipdb/ip2region.xdb").getInputStream();
            // 将 ip2region.db 转为 ByteArray
            byte[] cBuff = FileCopyUtils.copyToByteArray(inputStream);
            searcher = Searcher.newWithBuffer(cBuff);
        } catch (IOException e) {
            throw new SecurityException("ip2region.xdb 加载失败", e);
        }
    }

    /*
    在 Nginx 等代理之后获取用户真实 IP 地址
     */
    public static String getIpAddress(HttpServletRequest request) throws UnknownHostException {
        String ip = null;
        try {
            ip = request.getHeader("X-Real-IP");
            if (!isValidIp(ip)) {
                ip = request.getHeader("x-forwarded-for");
            }
            if (!isValidIp(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (!isValidIp(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (!isValidIp(ip)) {
                ip = request.getHeader("HTTP_CLIENT_IP");
            }
            if (!isValidIp(ip)) {
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            if (!isValidIp(ip)) {
                ip = request.getRemoteAddr();
                if (LOCALHOST_IPV4.equals(ip) || LOCALHOST_IPV6.equals(ip)) {
                    // 根据网卡取本机配置的 IP
                    InetAddress inet = InetAddress.getLocalHost();
                    ip = inet.getHostAddress();
                }
            }
            // 使用代理，则获取第一个 IP 地址
            if (StringUtils.hasText(ip) && ip.length() > MAX_IP_LENGTH) {
                int idx = ip.indexOf(",");
                if (idx > 0) {
                    ip = ip.substring(0, idx);
                }
            }
        } catch (Exception e) {
            ip = "";
        }
        return ip;
    }

    private static boolean isValidIp(String ip) {
        return StringUtils.hasText(ip) && !UNKNOWN.equalsIgnoreCase(ip);
    }

    /**
     * 根据 IP 从 ip2region.db 中获取地理位置
     *
     * @param ip IP 地址
     * @return 地理位置
     */
    public static String getIpSource(String ip) {
        try {
            String address = searcher.search(ip);
            if (StringUtils.hasText(address)) {
                address = address.replace("|0", "");
                address = address.replace("0|", "");
                return address;
            }
            return address;
        } catch (Exception e) {
            return "";
        }
    }
}
