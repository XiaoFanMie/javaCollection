package com.ff.javaList.Day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();

        alist.add("a");
        alist.add("b");
        alist.add("d");
        alist.add("c");
        alist.add("b");

        alist.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(alist);
    }
}
