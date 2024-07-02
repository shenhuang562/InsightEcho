package com.InsightEcho.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:QqProperties
 * Package:com.InsightEcho.config.properties
 * Description:QQ配置属性
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:15
 * @Version:v1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "oauth.qq")
public class QqProperties {

    /**
     * QQ appId
     */
    private String appId;

    /**
     * QQ clientSecret
     */
    private String appKey;

    /**
     * QQ登录类型
     */
    private String grantType;

    /**
     * QQ回调域名
     */
    private String redirectUrl;

    /**
     * QQ访问令牌地址
     */
    private String accessTokenUrl;

    /**
     * 用户OpenID获取地址
     */
    private String userOpenIdUrl;

    /**
     * QQ用户信息地址
     */
    private String userInfoUrl;

}
