package com.ff.javaList.Day2;

import java.util.LinkedList;

public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.addFirst("a");//在该列表开头插入指定的元素
        llist.addFirst("b");
        llist.addFirst("c1");
        llist.addLast("c2");//在该列表末尾插入指定的元素
        llist.addLast("b");

        System.out.println(llist);
        System.out.println(llist.indexOf("b"));//返回此列表中指定元素的第一次出现的索引
        System.out.println(llist.lastIndexOf("b"));//返回此列表中指定元素的最后一次出现的索引
        System.out.println(llist.removeFirst());//从此列表中删除并返回第一个元素
        System.out.println(llist.removeLast());//从此列表中删除并返回最后一个元素
        System.out.println(llist);

        llist.offerFirst("e1");//在此列表的前面插入指定的元素
        llist.offerLast("e2");//在此列表的后面插入指定的元素
        System.out.println(llist);

        //llist.clear();//清空集合
        System.out.println(llist.peekFirst());//检索但不删除此列表的第一个元素，如果此列表为空，则返回 null
        System.out.println(llist.peekLast());//检索但不删除此列表的最后一个元素，如果此列表为空，则返回 null
        System.out.println(llist);

        System.out.println(llist.pollFirst());//检索并删除此列表的第一个元素，如果此列表为空，则返回 null
        System.out.println(llist.pollLast());//检索并删除此列表的最后一个元素，如果此列表为空，则返回 null
        System.out.println(llist);
    }
}
