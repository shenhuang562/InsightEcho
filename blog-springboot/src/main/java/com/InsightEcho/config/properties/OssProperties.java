package com.InsightEcho.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:OssProperties
 * Package:com.InsightEcho.config.properties
 * Description:oss配置属性
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:07
 * @Version:v1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "upload.oss")
public class OssProperties {

    /**
     * oss域名
     */
    private String url;

    /**
     * 终点
     */
    private String endpoint;

    /**
     * 访问密钥id
     */
    private String accessKeyId;

    /**
     * 访问密钥密码
     */
    private String accessKeySecret;

    /**
     * bucket名称
     */
    private String bucketName;
}
