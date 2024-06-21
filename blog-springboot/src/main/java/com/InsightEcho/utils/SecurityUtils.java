package main.java.com.InsightEcho.utils;

import cn.dev33.satoken.secure.SaSecureUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * ClassName:SecurityUtils
 * Package:main.java.com.InsightEcho.utils
 * Description:密码加密
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午9:00
 * @Version:v1.0
 */

public class SecurityUtils {
    /*
    校验密码

    @param target 旧密码
    @param target2 新密码
    @return 是否正确
     */
    public static boolean checkPw(String target, String target2) {
        if (StringUtils.isEmpty(target) || StringUtils.isEmpty(target2)) {
            return false;
        }
        String encryptedPassword = sha256Encrypt(target2);
        return StringUtils.equals(encryptedPassword, target);
    }

    /*
    sha256加密

    @param password 密码
    @return 加密后的密码
     */
    public static String sha256Encrypt(String password) {
        if (StringUtils.isEmpty(password)) {
            return null;
        }
        return SaSecureUtil.sha256(password);
    }

}
