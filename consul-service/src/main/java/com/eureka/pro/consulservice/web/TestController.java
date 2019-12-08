package com.eureka.pro.consulservice.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestController
 * @date 2019/12/8  17:19
 */
@RestController
@RequestMapping("/sys")
@Slf4j
public class TestController {

    @GetMapping("getString")
    public String getString(){
        return "你成功的调用到我了你说怎么办吧";
    }
}
