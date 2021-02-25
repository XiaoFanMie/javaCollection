package Praice.practice;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("a");
        llist.add("b");
        llist.add("c");
        llist.add("d");

        //队列 先进先出
        int s = llist.size();
        for (int i = 0; i < s; i++) {
            System.out.print(llist.getFirst());
            llist.removeFirst();
        }
        System.out.println();
        System.out.println("__________________");
        LinkedList<String> llist1 = new LinkedList<>();
        llist1.add("a");
        llist1.add("b");
        llist1.add("c");
        llist1.add("d");
        int s1 = llist1.size();
        //链表 先进后出
        for (int i = 0; i < s1; i++) {
            System.out.print(llist1.peekLast());
            llist1.pollLast();
        }
    }
}
