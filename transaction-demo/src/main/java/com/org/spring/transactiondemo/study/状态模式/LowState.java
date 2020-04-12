package com.org.spring.transactiondemo.study.状态模式;

class LowState extends State
{
    public LowState(ScoreContext h)
    {
        hj=h;
        stateName="不及格";
        score=0;
    }

    public LowState(State state)
    {
        hj=state.hj;
        stateName="不及格";
        score=state.score;
    }
    @Override
    public void checkState()
    {
        if(score>=90)
        {
            hj.setState(new HighState(this));
        }
        else if(score>=60)
        {
            hj.setState(new MiddleState(this));
        }
    }   
}