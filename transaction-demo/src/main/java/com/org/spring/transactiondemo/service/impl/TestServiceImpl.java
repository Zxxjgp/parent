package com.org.spring.transactiondemo.service.impl;

import com.org.spring.transactiondemo.dao.TestMapper;
import com.org.spring.transactiondemo.entity.DeviceEntity;
import com.org.spring.transactiondemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    private TestMapper testMapper;

    @Override
    public List<DeviceEntity> get() {
        return testMapper.getTest();
    }

    @Transactional
    @Override
    public Integer insert(List<String> list) throws Exception {
        for (String str : list) {
            testMapper.insert(DeviceEntity.builder().name(str).id("110").build());
        }
        throw new Exception();
    }
}
