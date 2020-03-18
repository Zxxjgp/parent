package com.org.spring.transactiondemo.web;

import com.org.spring.transactiondemo.entity.TestEntity;
import com.org.spring.transactiondemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestController
 * @date 2020/3/15  22:22
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("get")
    public List<TestEntity> get() {
        List<TestEntity> testEntities = testService.get();
        return testService.get();
    }

    @GetMapping("insert")
    public Integer insert() throws Exception {
        List<String> list = new ArrayList<>();
        list.add("机构");
        list.add("测试");
        list.add("机器");
        list.add("目前");
        return testService.insert(list);
    }
}
