package com.ff.javaList.Day5;

import java.util.*;

/**
 * Map集合
 * 键值对存储
 * 键不能重复,值可以重复
 */
public class HashMapDemo2 {
    /**
     * HashMap 键值对
     * 键是无序的,如果有重读的键后面的值会覆盖上一个键的值
     * 可以存储一个为null的键
     */
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","a");
        hashMap.put("2","b");
        hashMap.put("1","c");
        hashMap.put("3","d");

        /*
        Map集合的遍历方法:
        1.foreach   2.keySet();     3.entrySet()
         */
        //hashMap.forEach((k,v)-> System.out.println(k+":"+v));

        /*
        keySet();取hashMap中所有的键,存储到Set集合中
        在对Set集合进行遍历,通过每次得到的Key去获取相对应的值
         */
        /*Set<String> set = hashMap.keySet();
        for (String key:set) {
            System.out.println(key+":"+hashMap.get(key));
        }*/

        /*
        values();获取hashMap中所有的值,存储到list集合中
         */
        /*Collection list = hashMap.values();
        System.out.println(list);*/


        /*entrySet();将hashMap中的键值对封装到一个entry对象中 */
        Set<Map.Entry<String,String>> entrySet = hashMap.entrySet();
        /*for (Map.Entry<String,String> entry: entrySet) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }*/
        Iterator<Map.Entry<String,String>> it = entrySet.iterator();
        while (it.hasNext()){
            /*Map.Entry<String,String> entry=it.next();
                System.out.println(entry.getKey()+":"+entry.getValue());*/
            System.out.println(it.next());
        }
    }
}
