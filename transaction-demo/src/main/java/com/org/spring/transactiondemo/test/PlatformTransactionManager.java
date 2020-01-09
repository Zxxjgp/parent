package com.org.spring.transactiondemo.test;

import org.springframework.lang.Nullable;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;

public interface PlatformTransactionManager extends TransactionManager {
    /**
     * 通过事务的定义返回一个事务的运行状态
     *
     * 事务的提交和事务的返回都是根据实物店的状态来定义的
     *
     * @param var1
     * @return
     * @throws TransactionException
     */
    TransactionStatus getTransaction(@Nullable TransactionDefinition var1) throws TransactionException;

    void commit(TransactionStatus var1) throws TransactionException;

    void rollback(TransactionStatus var1) throws TransactionException;

}
