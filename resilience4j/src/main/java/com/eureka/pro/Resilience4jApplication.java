package com.eureka.pro;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.concurrent.TimeUnit;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName Resilience4jApplication
 * @date 2019/12/11  23:56
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
@EnableFeignClients
@EnableAspectJAutoProxy
public class Resilience4jApplication {
    public static void main(String[] args) {
        SpringApplication.run(Resilience4jApplication.class, args);
    }
    @Bean
    public CloseableHttpClient httpClient() {
        return HttpClients.custom()
                .setConnectionTimeToLive(30, TimeUnit.SECONDS)
                .evictIdleConnections(30, TimeUnit.SECONDS)
                .setMaxConnTotal(200)
                .setMaxConnPerRoute(20)
                .disableAutomaticRetries()
                .setKeepAliveStrategy(new CustomConnectionKeepAliveStrategy())
                .build();
    }
}
