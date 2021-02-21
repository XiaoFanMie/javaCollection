package com.ff.javaList.Day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        /*
        迭代器1
        hasNext();判断集合中还有没有元素
        remove();删除元素,删除后里面的游标(指针,计数器)会回退一下
         */
        /* Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }*/

        /*
        迭代器2
        只适用于list接口实现类,遍历时还可以增删改,nextIndex（）还可以获取元素序号
         */
        ListIterator<String> liter = list.listIterator();
        /*  while (liter.hasNext()){
          System.out.println(liter.next()+":::"+liter.nextIndex());
            *//*liter.set("5");*//*
        }*/
        while (liter.hasNext()){
            liter.next();
            liter.add("1.1");
            /*if (liter.next().equals("1.1")){
                liter.remove();
            }*/
        }
        System.out.println(list);

        /*
        逆序遍历
        hasPrevious();有没有上一个
        liter.previous();获取前一个
         */
       /* ListIterator<String> liter1 = list.listIterator(list.size());
        System.out.println(liter1.hasPrevious(l));
        while (liter1.hasPrevious()){
            System.out.println(liter1.previous());
        }
        System.out.println(list);*/
    }
}
