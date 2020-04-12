package com.org.spring.transactiondemo.study.cas;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName AtomicTest
 * @date 2020/4/12  22:57
 */
public class AtomicTest {
    public static void main(String[] args) {
        UserRO var1 = new UserRO("焦关平", 25);
        AtomicReference<UserRO> atomicReference = new AtomicReference<>(var1);
        UserRO var2 = new UserRO("秦朗", 25);

        atomicReference.compareAndSet(var1, var2);
        System.out.println(atomicReference.get().toString());
        LinkedList<String> queue;
        queue = new LinkedList<>();/*
        queue.add("jgp");
        queue.add("ql");
        queue.add("123");
        System.out.println(queue.size());
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());
        System.out.println(queue.get(1));
        System.out.println(queue.size());
     //   System.out.println(queue.poll());
        System.out.println(queue.remove());*/
        System.out.println(queue.size());
      //  System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.offer("12312312"));
        System.out.println(queue.size());
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            iterator.remove();
            System.out.println(text);
            System.out.println(iterator.hasNext());
        }

        List<String> list = new ArrayList<>();
        list.add("菜鸟驿站");
        List<String> list1 = Collections.unmodifiableList(list);
        list1.add("eqwewqewq");
    }
}
