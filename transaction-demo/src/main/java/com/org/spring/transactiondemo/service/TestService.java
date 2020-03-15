package com.org.spring.transactiondemo.service;

import com.org.spring.transactiondemo.entity.DeviceEntity;

import java.util.List;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestService
 * @date 2020/3/15  22:20
 */
public interface TestService {

    List<DeviceEntity> get();

    Integer insert(List<String> list) throws Exception;
}
