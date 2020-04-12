package com.org.spring.transactiondemo.study.cas;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName UserRO
 * @date 2020/4/12  22:58
 */
@Data
@AllArgsConstructor
public class UserRO implements Serializable {
    private String name;
    private Integer age;
}
