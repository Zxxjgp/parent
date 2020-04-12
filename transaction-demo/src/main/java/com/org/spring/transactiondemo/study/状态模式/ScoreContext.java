package com.org.spring.transactiondemo.study.状态模式;

//环境类
class ScoreContext
{
    private State state;
    ScoreContext()
    {
        state=new LowState(this);
    }
    public void setState(State state)
    {
        this.state=state;
    }
    public State getState()
    {
        return state;
    }   
    public void add(int score)
    {
        state.addScore(score);
    }
}