package com.ff.javaList.Day3;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        /**
         * 底层是数组实现的
         * v= new Vector<>() 在创建Vector对象时,就已经创建底层存储数组,长度为10
         * Vector中的方法都是线程安全的
         */
        Vector<String> v= new Vector<>();
        v.add("a");
        v.add("a");
        v.add("c");
        v.add("f");
        System.out.println(v);
    }
}
