package com.org.spring.transactiondemo.desgin.状态模式;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName ConcreteStateB
 * @date 2020/3/23  23:28
 */
public class ConcreteStateB extends AbstractState {
    @Override
    public void Handle(Context context) {
        System.out.println("我是状态A");
        context.setState(new ConcreteStateA());
    }
}
