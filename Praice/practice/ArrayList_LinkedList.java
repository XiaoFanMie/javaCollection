package Praice.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {
    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<>();
        long s = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            alist.add(0,"a");
        }
        System.out.println(System.currentTimeMillis()-s);

        LinkedList<String> llist = new LinkedList<>();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
           llist.add(0,"a");
        }
        System.out.println(System.currentTimeMillis()-s1);


        long s11 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            alist.get(i);
        }
        System.out.println(System.currentTimeMillis()-s11);


        long s3 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            llist.get(i);
        }
        System.out.println(System.currentTimeMillis()-s3);
    }
}
