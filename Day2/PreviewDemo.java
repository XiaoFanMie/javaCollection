package com.ff.javaList.Day2;

import javafx.beans.binding.ListExpression;

import java.util.ArrayList;

public class PreviewDemo {
    private static ListExpression<Object> list;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("e");
        PreviewDemo.GetItetar(list);
    }

   /* public static void GetItetar(ArrayList list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            int count=0;
            String str = iter.next();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)==str){
                    count++;
                }
            }
            if (count>=2){
                iter.remove();
            }
        }
        System.out.println(list);
    }*/ 
   /*public static void GetItetar(ArrayList list) {
       ArrayList<Object> list1 = new ArrayList();
       for (int i = 0; i < list.size(); i++) {
           if (!list1.contains(list.get(i))){
               list1.add(list.get(i));
           }
       }
        System.out.println(list1);
    }*/
    public static void GetItetar(ArrayList list) {
       for (int i = 0; i < list.size(); i++) {
           for (int j = i+1; j < list.size() -i; j++) {
               if (list.get(i)==list.get(j)){
                   list.remove(j);
                   j--;
               }
           }
       }
        System.out.println(list);
    }
}

