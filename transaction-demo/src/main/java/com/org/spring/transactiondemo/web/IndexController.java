package com.org.spring.transactiondemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName IndexController
 * @date 2020/3/16  21:54
 */
@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("index")
    public String indexs(){
        return "index";
    }
}
