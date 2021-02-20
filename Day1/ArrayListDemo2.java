package com.ff.javaList.Day1;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("a");
        alist.add("b");
        alist.add("c");
        alist.add("d");
        alist.add("f");
        ArrayList<String> alist1 = new ArrayList<>();
        alist1.add("a");
        alist1.add("b");
        alist1.add("c");
        alist1.add("d");
        alist1.add("e");

        //alist.forEach((a)-> System.out.println(a));

        //addAll 合并两个集合中的元素,相当于求并集
       /* alist.addAll(alist1);//
        System.out.println(alist);*/

        //containsAll 是否包含另一个集合中的元素,包含则返回true
        /*System.out.println(alist.containsAll(alist1));*/

        //removeAll 删除两个集合中相同的元素,有变化则返回true,相当求差4集
        /*System.out.println(alist.removeAll(alist1));
        System.out.println(alist);*/

        //retainAll 保留两个集合中相同的元素,有变化则返回true 相当于求交集
        System.out.println(alist.retainAll(alist1));
        System.out.println(alist);



    }
}
