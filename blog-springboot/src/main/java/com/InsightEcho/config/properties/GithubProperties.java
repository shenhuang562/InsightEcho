package com.InsightEcho.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:GithubProperties
 * Package:com.InsightEcho.config.properties
 * Description:Github配置属性
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:04
 * @Version:v1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "oauth.github")
public class GithubProperties {

    /**
     * clientId
     */
    private String clientId;

    /**
     * clientSecret
     */
    private String clientSecret;

    /**
     * Github回调域名
     */
    private String redirectUrl;

    /**
     * Github访问令牌地址
     */
    private String accessTokenUrl;

    /**
     * Github用户信息地址
     */
    private String userInfoUrl;
}
