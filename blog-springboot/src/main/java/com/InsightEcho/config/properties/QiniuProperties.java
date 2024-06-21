package com.InsightEcho.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:QiniuProperties
 * Package:com.InsightEcho.config.properties
 * Description:七牛云配置属性
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:15
 * @Version:v1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "upload.qiniu")
public class QiniuProperties {

    /**
     * url 或者 域名
     */
    private String url;

    /**
     * 存储桶名字
     */
    private String bucketName;

    /**
     * //区域 如hubei wuhai
     */
    private String region;

    /**
     * accessKey
     */
    private String accessKey;

    /**
     * secretKey
     */
    private String secretKey;
}
