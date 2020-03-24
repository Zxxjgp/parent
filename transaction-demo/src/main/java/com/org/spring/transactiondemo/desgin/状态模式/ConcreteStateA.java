package com.org.spring.transactiondemo.desgin.状态模式;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName ConcreteStateA
 * @date 2020/3/23  23:28
 */
public class ConcreteStateA extends AbstractState {
    @Override
    public void Handle(Context context) {
        System.out.println("我是状态B");
        context.setState(new ConcreteStateB());
    }
}
