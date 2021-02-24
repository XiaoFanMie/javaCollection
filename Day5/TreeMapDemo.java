package com.ff.javaList.Day5;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        /**
         * TreeMap 键值对
         * 键不重复
         * 可根据键的自然顺序排序,指定的键的类型的类必须事先Comparede接口,在排序时使用
         */
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("1","a");
        treeMap.put("2","b");
        treeMap.put("1","c");
        treeMap.put("4","c");
        treeMap.put("3","d");
        System.out.println(treeMap);
    }
}
