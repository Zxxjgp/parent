package com.eureka.pro.inteface;

import org.springframework.stereotype.Component;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName FabackTestService
 * @date 2019/12/8  18:21
 */
@Component
public class FabackTestService implements TestInterface {
    @Override
    public String get() {
        return "卧槽 无情";
    }
}
