package com.org.spring.transactiondemo.study.thread;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName ThreadTest
 * @date 2020/4/12  23:43
 */
public class ThreadTest {
    public static void main(String[] args) {

    }
    /****************************start**********************/
    /**
     * 线程会有五中状态：
     * 创建状态，就绪状态、阻塞状态、运行状态，执行完成状态、永久阻塞状态
     * 创建线程会有三种方式，单继承多实现，extends 多实现implements
     *    1、extends thread
     *    2、implements Runnable接口 没有返回值
     *    3、实现Callable接口 有返回值
     *    一个线程只能被start()一次，但是可以有多次的run()
     *    sleep and wait 的区别就是 sleep 是thread的而wait是Object的
     *
     *    线程池有哪几种状态、运行状态，不接受新任务（执行完线程池中的任务、还有一种是是会中断任务）
     *    线程池里面的任务会有两种提交方式、第一种是通过submit（只接受Runnable） execute可以接受Runnable和Callable
     *    java程序中保证多线程的安全（安全类，自动锁和手动锁）
     *    防止死锁：使用安全类（java.util.concurrent.*下面的类）、减小做的力度、减少同步代码块的使用、使用trylock代码块
     *
     *    ThreadLocal是为线程提供自己的变量副本、所以每一个线程改变自己的变量而不会影响其他的变量
     *    使用场景上面数据连接池和session的管理
     *
     */
    /****************************end************************/
}
