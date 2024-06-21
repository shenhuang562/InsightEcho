package main.java.com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:UploadModeEnum
 * Package:main.java.com.InsightEcho.enums
 * Description:上传模式枚举
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午10:43
 * @Version:v1.0
 */
@Getter
@AllArgsConstructor
public enum UploadModeEnum {

    /**
     * 本地
     */
    LOCAL("local", "localUploadStrategyImpl"),

    /**
     * oss
     */
    OSS("oss", "ossUploadStrategyImpl"),

    /**
     * cos
     */
    COS("cos", "cosUploadStrategyImpl"),

    /**
     * qiniu
     */
    QINIU("qiniu", "qiniuUploadStrategyImpl");

    /**
     * 模式
     */
    private final String mode;

    /**
     * 策略
     */
    private final String strategy;

    /**
     * 获取策略
     *
     * @param mode 模式
     * @return 搜索策略
     */
    public static String getStrategy(String mode) {
        if (mode == null) {
            return null;
        }

        for (UploadModeEnum value : values()) {
            if (value.getMode().equals(mode)) {
                return value.getStrategy();
            }
        }
        return null;
    }
}
