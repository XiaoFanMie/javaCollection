package com.ff.javaList.Day3;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        /**
         * Set不能存储重复元素
         * HashSet无序存储
         */
        HashSet h = new HashSet();
        h.add("a");
        h.add("b");
        h.add("a");
        h.add("w");
        h.add("s");
        h.add("f");
        h.add("d");
        h.add("e");
        h.add("h");
        h.add("j");
        h.add("k");
        h.add("n");
        h.add("m");
        h.add("v");
        System.out.println(h);
    }
    /*
    1.哈希结构的底层是如何存储数据的
    哈希表本职业是数组
    2.HashSet是如何去除重复元素的
    先用元素的哈希值比较(快),但是内容不同,hash值可能相同
    hash相同时,在使用equals()方法判断内容是否相等(安全可靠,效率低)
    双保险:保证效率,有保证了安全
     */
}
