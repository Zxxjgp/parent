package com.org.spring.transactiondemo.desgin.状态模式;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName State
 * @date 2020/3/23  23:44
 */
public abstract class State {
    protected ScoreContext hj;  //环境
    protected String stateName; //状态名
    protected int score; //分数
    //检查当前状态
    public abstract void checkState();
    public void addScore(int x)
    {
        score+=x;
        System.out.print("加上："+x+"分，\t当前分数："+score );
        checkState();
        System.out.println("分，\t当前状态："+hj.getState().stateName);
    }
}
