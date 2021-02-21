package com.ff.javaList.Day2;

import java.util.ArrayList;
import java.util.Iterator;

public class Preview {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        Preview.ForDemo(list);
        Preview.ForEachDemo(list);
        Preview.IteratorDemo(list);
    }
    public static void ForDemo(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void ForEachDemo(ArrayList list){
        for (Object o:list) {
            System.out.println(o);
        }
    }
    public static void IteratorDemo(ArrayList list){
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
