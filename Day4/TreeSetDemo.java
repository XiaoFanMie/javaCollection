package com.ff.javaList.Day4;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /*
		  TreeSet 可以按照元素的自然顺序排序
		  底层是红黑树
		 */
        TreeSet<String> t = new TreeSet<String>();
        t.add("1");
        t.add("2");
        t.add("1");
        t.add("4");
        t.add("3");
        System.out.println(t);

    }
}

