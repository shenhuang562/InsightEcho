package com.InsightEcho.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/**
 * ClassName:CosProperties
 * Package:com.InsightEcho.config.properties
 * Description:cos配置属性
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:00
 * @Version:v1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "upload.cos")
public class CosProperties {

    /**
     * cos域名
     */
    private String url;

    /**
     * 访问密钥id
     */
    private String secretId;

    /**
     * 访问密钥密码
     */
    private String secretKey;

    /**
     * 所属区域
     */
    private String region;

    /**
     * 存储桶名称
     */
    private String bucketName;
}
