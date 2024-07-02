package com.InsightEcho.config;

import com.InsightEcho.strategy.UploadStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
/**
 * ClassName:AppConfig
 * Package:com.InsightEcho.config
 * Description:
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午7:11
 * @Version:v1.0
 */
@Configuration
public class AppConfig {

    @Bean
    public Map<String, UploadStrategy> uploadStrategyMap() {
        return new HashMap<>();
    }
}
