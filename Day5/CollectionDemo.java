package com.ff.javaList.Day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        /*ArrayList arrayList = new ArrayList();
        arrayList.add("x");
        Collections.addAll(arrayList,"a","g","d");//多个元素进行添加
        System.out.println(arrayList);

        Collections.sort(arrayList);//对集合进行排序
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList,"d"));//二分查找
        */
        ArrayList arrayList1 = new ArrayList();
        Collections.addAll(arrayList1,"a","g","d","c");
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(arrayList2,"x","y","z");
        Collections.copy(arrayList1,arrayList2);//要求目标集合的size大于sec源集合的size
        System.out.println(arrayList1);

        List list = Collections.emptyList();//返回一个空集合,无法进行add操作
        //list.add("a");  java.lang.UnsupportedOperationException
        System.out.println(list);

        Collections.fill(arrayList2,"w");//用指定元素对目标集合进行覆盖
        System.out.println(arrayList2);

        System.out.println(Collections.max(arrayList1));//返回集合中最大元素
        System.out.println(Collections.replaceAll(arrayList1,"x","X"));//对集合中的指定元素进行替换,替换成功返回true
        System.out.println(arrayList1);

        Collections.reverse(arrayList1);//对集合进行翻转
        System.out.println(arrayList1);

        Collections.swap(arrayList1,0,3);//对集合中的两个元素进行互换
        System.out.println(arrayList1);
    }
}
