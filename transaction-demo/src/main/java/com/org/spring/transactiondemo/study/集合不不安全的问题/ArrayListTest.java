package com.org.spring.transactiondemo.study.集合不不安全的问题;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName ArrayListTest
 * @date 2020/4/14  0:10
 * hashset的底层是hashmap
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> integers = new ArrayList<>();
        integers.add("11");
        integers.add("22");
        integers.forEach(System.out::println);
        new Thread(() -> {
            integers.add(UUID.randomUUID().toString().substring(8));
        });

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("");

        List<String > list1 = new Vector<>();
        list1.add("");

        List<String> list2 = Collections.synchronizedList(new ArrayList<>());
        list2.add("");

        HashSet<Object> objects = new HashSet<>();
        objects.add("");

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("", "");

        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("", "");

    }
}
