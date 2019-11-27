package com.eureka.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName Client1Application
 * @date 2019/11/26  21:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Client1Application {
    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class , args);
    }
}
