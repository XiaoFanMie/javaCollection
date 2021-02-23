package com.ff.javaList.Day4;

import java.util.TreeSet;

public class TreeSetDemo3 {
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

        //Set遍历方式
        /* t.stream().forEach((a)->System.out.print(a));*/

		/*
		  增强for
		  for (String s : t) {
			System.out.println(s);
		}*/

        /*
        迭代器遍历
        Iterator<String> it =  tset.iterator();
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }*/

    }
}

