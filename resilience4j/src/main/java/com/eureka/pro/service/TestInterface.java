package com.eureka.pro.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestInterface
 * @date 2019/11/27  20:59
 */
@FeignClient(name = "client1", contextId = "index")
public interface TestInterface {

    @GetMapping("/get")
    String get();
}
