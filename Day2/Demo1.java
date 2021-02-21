package com.ff.javaList.Day2;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");

        /*
        遍历方式1:forEach
         */
        /*list.stream().forEach((a)-> System.out.println(a));*/

        /*
        遍历方式2:for循环
        可以在集合中删除元素,但是下标与集合中的内容不对应
         */
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("d")){
                list.remove(i);
            }
        }*/


        /*
        遍历方式3:增强for循环
        理论上在遍历过程中不允许删除集合中的元素 java.util.ConcurrentModificationException
        如果需要删除,只能删除一个,还要快速使用break
         */
        for (String s : list) {
            if (s.equals("d")) {
                list.remove(s);
                break;
            }
        }
        System.out.println(list);
    }
}
