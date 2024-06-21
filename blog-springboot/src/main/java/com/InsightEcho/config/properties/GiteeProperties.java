package com.InsightEcho.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/**
 * ClassName:GiteeProperties
 * Package:com.InsightEcho.config.properties
 * Description:Gitee配置属性
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:02
 * @Version:v1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "oauth.gitee")
public class GiteeProperties {

    /**
     * clientId
     */
    private String clientId;

    /**
     * clientSecret
     */
    private String clientSecret;

    /**
     * Gitee登录类型
     */
    private String grantType;

    /**
     * Gitee回调域名
     */
    private String redirectUrl;

    /**
     * Gitee访问令牌地址
     */
    private String accessTokenUrl;

    /**
     * Gitee用户信息地址
     */
    private String userInfoUrl;

}
