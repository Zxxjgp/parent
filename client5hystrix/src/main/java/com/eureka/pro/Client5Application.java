package com.eureka.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName Client5Application
 * @date 2019/12/8  23:09
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Client5Application {
    public static void main(String[] args) {
        SpringApplication.run(Client5Application.class,args);
    }
}
