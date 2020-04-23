package com.org.spring.transactiondemo.study.并发类;

import java.util.concurrent.*;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName ConcurrentTest
 * @date 2020/4/21  23:16
 */
public class ConcurrentTest {
    public static void main(String[] args) throws InterruptedException {

        //做减法的并发类
       // CountDownLatch downLatch = new CountDownLatch(1);
       // downLatch.await();
        //System.out.println(downLatch.getCount());

        //做加法的并发类（人齐了才可以吃饭的）
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("my name is jgp, 我开始召唤升龙了");
        });

        for (int i = 0; i < 7; i++) {

            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                try {
                    System.out.println("-------------------" + cyclicBarrier.getNumberWaiting());
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }

        //信号量的主要目的是用于一个资源的互斥使用、另外一个用于并发线程的数量控制
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "\t抢占车位");
                    TimeUnit.SECONDS.sleep(30);
                    System.out.println(Thread.currentThread().getName() + "\t离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }
    }
}
