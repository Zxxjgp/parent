package com.org.spring.transactiondemo.study.状态模式;

//具体状态类：优秀
class HighState extends State
{
    public HighState(State state)
    {
        hj=state.hj;
        stateName="优秀";
        score=state.score;
    }           
    @Override
    public void checkState()
    {
        if(score<60)
        {
            hj.setState(new LowState(this));
        }
        else if(score<90)
        {
            hj.setState(new MiddleState(this));
        }
    }
}
