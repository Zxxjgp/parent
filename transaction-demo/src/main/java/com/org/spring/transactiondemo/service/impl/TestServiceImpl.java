package com.org.spring.transactiondemo.service.impl;

import com.org.spring.transactiondemo.dao.TestMapper;
import com.org.spring.transactiondemo.entity.TestEntity;
import com.org.spring.transactiondemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestServiceImpl
 * @date 2020/3/15  22:21
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestService testService;

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestEntity> get() {
        return testMapper.getTest();
    }

    @Transactional
    @Override
    public Integer insert(List<String> list) throws Exception {
        for (String str : list) {
            testService.insertq(TestEntity.builder().name(str).id("110").build());
        }
        return 0;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void insertq(TestEntity p) {
        testMapper.insert(p);
    }
}
