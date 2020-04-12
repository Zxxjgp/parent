package com.org.spring.transactiondemo.study.状态模式;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName AbstractState
 * @date 2020/3/23  23:27
 */
public abstract class AbstractState {
    public abstract void Handle(Context context);
}
