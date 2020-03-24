package com.org.spring.transactiondemo.dto.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestVO
 * @date 2020/3/23  10:18
 */
@Data
public class TestVO {
    @NotEmpty(message = "name不可以为空")
    private String name;
    private String age = "123";
}
