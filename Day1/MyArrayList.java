package com.ff.javaList.Day1;

import java.util.ArrayList;

public class MyArrayList extends ArrayList {
    public static void main(String[] args) {
        MyArrayList mylist = new MyArrayList();
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        mylist.add("4");
        mylist.add("5");
        /*
        受保护的方法,在子类中访问
        删除1-4区间的元素,包括1不包括4
         */
        mylist.removeRange(1,4);
        System.out.println(mylist);
    }
}
