package com.ff.javaList.Day4;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
       /*
       2.HashSet是如何去除重复元素的
        先用元素的哈希值比较(快),但是内容不同,hash值可能相同
        hash相同时,在使用equals()方法判断内容是否相等(安全可靠,效率低)

        hash值怎么来:调用hashCode()方法
        两种情况:
        1.类中已经重写hashCode(),例如String类,根据内容计算hash值
        2.类中没有重写hashCode(),调用Object类中的hashCode()
        */
        HashSet<String> h= new HashSet<>();
        h.add("a");
        h.add("c");
        h.add("b");
        h.add("a");
        System.out.println(h);
    }
}
