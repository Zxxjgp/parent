package com.org.spring.transactiondemo.study.状态模式;

//具体状态类：中等
class MiddleState extends State
{
    public MiddleState(State state)
    {
        hj=state.hj;
        stateName="中等";
        score=state.score;
    }
    public void checkState()
    {
        if(score<60)
        {
            hj.setState(new LowState(this));
        }
        else if(score>=90)
        {
            hj.setState(new HighState(this));
        }
    }
}