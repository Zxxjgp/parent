package com.org.spring.transactiondemo.study.状态模式;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName Context
 * @date 2020/3/23  23:30
 */
public class Context {
    private AbstractState state;

    public Context() {
        this.state =  new ConcreteStateA();
    }
    //设置新状态
    public void setState(AbstractState state)
    {
        this.state=state;
    }
    //读取状态
    public AbstractState getState()
    {
        return(state);
    }

    //对请求做处理
    public void Handle()
    {
        System.out.println("----------" + this.getClass().getName() );
        state.Handle(this);
    }


}
