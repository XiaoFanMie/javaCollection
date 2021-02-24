package com.ff.javaList.Day5;

import java.util.HashMap;

/**
 * Map集合
 * 键值对存储
 * 键不能重复,值可以重复
 */
public class HashMapDemo {
    /**
     * HashMap 键值对
     * 键是无序的,如果有重读的键后面的值会覆盖上一个键的值
     * 可以存储一个为null的键
     */
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","a");
        hashMap.put("2","b");
        hashMap.put("1","2");
        hashMap.put("3","d");
        hashMap.put(null,"d");
        System.out.println(hashMap);

        hashMap.remove("2");
        hashMap.remove("c");
        System.out.println(hashMap);

        //hashMap.clear();
        System.out.println(hashMap.containsKey("2"));
        System.out.println(hashMap.containsValue("d"));
        System.out.println(hashMap);

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
    }
}
