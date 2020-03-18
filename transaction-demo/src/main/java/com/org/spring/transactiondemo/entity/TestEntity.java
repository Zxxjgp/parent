package com.org.spring.transactiondemo.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName
 *
 * @date 2020/3/15  22:18
 */
@Data
@Builder
public class TestEntity {

    private String id;
    private String name;
    private String telNo;
}
