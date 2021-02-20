package com.ff.javaList.Day1;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("a");
        llist.add("b");
        llist.add("c");
        llist.add("d");
        llist.add("e");
        //查找某个元素从头结点或者尾结点开始查找,所有查询效率低
        System.out.println(llist.get(3));
    }
}
