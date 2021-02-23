package com.ff.javaList.Day4;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /*
		  TreeSet 可以按照元素的自然顺序排序
		  底层是红黑树
		 */
        TreeSet<Student> t = new TreeSet<Student>();
        Student s1= new Student(10,"我丢");
        Student s2= new Student(11,"通话");
        Student s3= new Student(11,"重地");
        Student s4= new Student(10,"我丢");
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);

        System.out.println(t);

    }
}

