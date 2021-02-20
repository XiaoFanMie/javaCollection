package com.ff.javaList.Day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        调用默认无参的构造方法时,创建ArrayList对象时,并没有实际的创建数组
        在第一次添加元素时创建,默认长度为10
        ArrayList最大容量 MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8
         */
        ArrayList<String> alist = new ArrayList<>();
        /*
        调用有参构造方法,创建ArrayList对象时,创建一个指定长度的数组
         */
        ArrayList<String> alist1 = new ArrayList<>(5);

        alist.add("1");
        alist.add("2");
        alist.add("3");
        alist.add("4");
        alist.add("5");
        alist.add("6");
        alist.add("7");
        alist.add("8");
        alist.add("9");
        alist.add("10");
        //当add添加元素后,数组满了之后会扩容为原来的1.5倍
        alist.add("11");
        System.out.println(alist);

        System.out.println("获取指定索引的数"+alist.get(2));
        alist.set(2,"12");//改变指定索引的元素
        System.out.println(alist);

        System.out.println(alist.indexOf("4"));//从前获取元素的索引位置
        System.out.println(alist.lastIndexOf("10"));//从后开始获取元素的索引位置

        List<String> list = alist.subList(2,5);//获取指定索引区间的元素
        System.out.println(list);

    }
}
