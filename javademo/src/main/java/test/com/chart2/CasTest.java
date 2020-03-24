package test.com.chart2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName CasTest
 * @date 2020/3/22  22:50
 */
public class CasTest {
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(5);
        int andIncrement = integer.getAndIncrement();
        System.out.println(andIncrement);
        int i = integer.addAndGet(9);
        System.out.println(i);
        int i1 = integer.decrementAndGet();
        System.out.println(i1);
        int andDecrement = integer.getAndDecrement();
        System.out.println(andDecrement);
        //比较交换
        boolean b = integer.compareAndSet(13, 2019);
        System.out.println(b);
        System.out.println(integer.get());
        String str = "";
        integer.set(1);
        System.out.println(integer.get());
        //add 的意思
        integer.getAndAdd(2);
        System.out.println(integer.get());

        MyData myData = new MyData();
        for (int x=1; x < 20; x++) {
            new Thread(() -> {
                for (int j = 1; j < 1000; j++) {
                    myData.adPlusplus();

                }
            }
            ,  String.valueOf(i)).start();
        }
        //需要等待上面执行20个线程执行完成之后，用main线程去的最终的值
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "11111" + myData.number);

/*        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public static void seeokByVolicate() {}
}
