package com.eureka.pro.web;

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
@RequestMapping("/index")
public class IndexController {
    @GetMapping("/get")
    public String get() {
        return "okk";
    }
}
