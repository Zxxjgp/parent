package com.eureka.pro.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName HttpConfig
 * @date 2019/11/27  21:09
 */
@Configuration
public class HttpConfig {
    @Bean
    public CloseableHttpClient httpClient() {
        return HttpClients.custom()
                .setConnectionTimeToLive(30, TimeUnit.SECONDS)
                .evictIdleConnections(30, TimeUnit.MINUTES)
                .setMaxConnTotal(500)
                .setMaxConnPerRoute(50)
                .disableAutomaticRetries()
                .setKeepAliveStrategy(new CustomConnectionKeepAliveStrategy())
                .build();
    }
}
