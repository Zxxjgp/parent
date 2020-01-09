package com.eureka.pro.web;

import com.eureka.pro.inteface.TestInterface;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaServiceRegistry;
import org.springframework.context.support.DefaultLifecycleProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName IndexController
 * @date 2019/11/27  0:23
 */
@RestController
@RequestMapping("/sys")
public class IndexController {


    @Value("${test.jj}")
    public String jj;

    @Autowired
    private TestInterface testInterface;

    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "sb")
    public String get() {
        String s = testInterface.get();
        return s;
    }

    public String sb(){
        return "我靠  你 sb 了";
    }

    @GetMapping("gh")
    public String getss(){
        return jj;
    }
}
