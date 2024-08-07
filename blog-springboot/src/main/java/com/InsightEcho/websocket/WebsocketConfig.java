package com.InsightEcho.websocket;

import com.google.errorprone.annotations.DoNotMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
/**
 * ClassName:WebsocketConfig
 * Package:com.InsightEcho.websocket
 * Description: websocket 配置
 *
 * @Author:mind-king
 * @Create:2024/6/30 - 下午11:26
 * @Version:v1.0
 */
@Configuration
@EnableWebSocket
public class WebsocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
