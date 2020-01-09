package com.eureka.pro.web;

import com.eureka.pro.service.TestInterface;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerOpenException;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.vavr.control.Try;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestResliienceController
 * @date 2019/12/12  0:09
 */
@RestController
@RequestMapping("/index")
public class TestResliienceController {

    @Autowired
    private TestInterface testInterface;


    private CircuitBreaker circuitBreaker;

    public TestResliienceController(CircuitBreakerRegistry circuitBreakerRegistry) {
        circuitBreaker   = circuitBreakerRegistry.circuitBreaker("menu");
    }


    @GetMapping("get1")
    public String get1() {
        return Try.ofSupplier(
                CircuitBreaker.decorateSupplier(circuitBreaker,
                        () -> testInterface.get()))
                .recover(CircuitBreakerOpenException.class, "我是测试人员")
                .get();
    }
    /**
     * 注解
     * @return
     */
    @GetMapping("/get")
    @io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker(name = "order")
    public String getClent1(){
        return testInterface.get();
    }
}
