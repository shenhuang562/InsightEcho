package com.InsightEcho.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ClassName:RestTemplateConfig
 * Package:com.InsightEcho.config
 * Description:RestTemplate配置
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:18
 * @Version:v1.0
 */
@Configuration
public class RestTemplateConfig {

    @Bean("restTemplate")
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(List.of(MediaType.TEXT_HTML, MediaType.TEXT_PLAIN));
        restTemplate.getMessageConverters().add(converter);
        restTemplate.setRequestFactory(clientHttpRequestFactory());
        return restTemplate;
    }

    @Bean
    public ClientHttpRequestFactory clientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        // 设置连接超时时间为5秒
        factory.setConnectTimeout(5000);
        // 设置读取超时时间为10秒
        factory.setReadTimeout(10000);
        return factory;
    }
}
