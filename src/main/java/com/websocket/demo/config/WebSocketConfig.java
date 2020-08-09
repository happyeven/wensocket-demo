package com.websocket.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Author ZHUDO2
 * @Date 8/9/2020 8:18 PM
 * @Version 1.0
 */
@Configuration
public class WebSocketConfig {
    @Bean
    public
    ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
