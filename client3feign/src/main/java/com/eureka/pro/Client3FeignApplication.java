package com.eureka.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName
 * @date 2019/11/26  21:17
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
/*@EnableHystrix*/
public class Client3FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(Client3FeignApplication.class , args);
    }
}
