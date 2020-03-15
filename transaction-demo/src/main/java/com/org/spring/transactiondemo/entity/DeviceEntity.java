package com.org.spring.transactiondemo.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName DeviceEntity
 * @date 2020/3/15  22:18
 */
@Data
@Builder
public class DeviceEntity {

    private String id;
    private String name;
}
