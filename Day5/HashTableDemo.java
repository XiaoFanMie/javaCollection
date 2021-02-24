package com.ff.javaList.Day5;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableDemo {
    public static void main(String[] args) {
        /**
         * Hashtable 无序的
         * 初始容量为11
         * 线程安全,不允许有键为null的键
         */
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("a","1");
        hashtable.put("b","2");
        hashtable.put("c","3");
        hashtable.put("d","4");
        //hashtable.put(null,"4");
        System.out.println(hashtable);
    }
}
