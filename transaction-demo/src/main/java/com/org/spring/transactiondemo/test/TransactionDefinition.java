package com.org.spring.transactiondemo.test;

import org.springframework.lang.Nullable;

public interface TransactionDefinition {
    int PROPAGATION_REQUIRED = 0;
    int PROPAGATION_SUPPORTS = 1;
    int PROPAGATION_MANDATORY = 2;
    int PROPAGATION_REQUIRES_NEW = 3;
    int PROPAGATION_NOT_SUPPORTED = 4;
    int PROPAGATION_NEVER = 5;
    int PROPAGATION_NESTED = 6;
    int ISOLATION_DEFAULT = -1;
    int ISOLATION_READ_UNCOMMITTED = 1;
    int ISOLATION_READ_COMMITTED = 2;
    int ISOLATION_REPEATABLE_READ = 4;
    int ISOLATION_SERIALIZABLE = 8;
    int TIMEOUT_DEFAULT = -1;

    /**
     *
     * PROPAGATION_SUPPORTS a 调用B  a 有事务， 但是B也是需要有事务的，没有的话就是新建  这个时候a调用B ，a和B就是使用同一个事务
     *
     * PROPAGATION_SUPPORTS  a 调用 b  a有事务 则B有， A没有事务则B就没有
     *
     * PROPAGATION_MANDATORY a 调用 b  ， 调用方必须要有事务
     *
     * PROPAGATION_REQUIRES_NEW a 调用 b  ， 不管a有没有事务b都需要事务的（JTA中生效）
     *
     * PROPAGATION_NOT_SUPPORTED a 调用 b  ， 不管A有没有用事务B都不会有事务
     *
     * PROPAGATION_NEVER  不允许有事务的存在
     *
     */
}