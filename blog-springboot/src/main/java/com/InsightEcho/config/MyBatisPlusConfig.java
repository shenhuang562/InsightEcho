package com.InsightEcho.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * ClassName:MyBatisPlusConfig
 * Package:com.InsightEcho.config
 * Description:MybatisPlus配置
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:17
 * @Version:v1.0
 */
@Configuration
@MapperScan("com.InsightEcho.mapper")
public class MyBatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 添加分页插件
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }

}
