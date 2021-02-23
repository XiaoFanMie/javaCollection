package com.ff.javaList.Day4;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
       /*
       2.HashSet是如何去除重复元素的
        先用元素的哈希值比较(快),但是内容不同,hash值可能相同
        hash相同时,在使用equals()方法判断内容是否相等(安全可靠,效率低)

        hash值怎么来:调用hashCode()方法
        两种情况:
        1.类中已经重写hashCode(),例如String类,根据内容计算hash值
        2.类中没有重写hashCode(),调用Object类中的hashCode()
        */
        HashSet<Student> h= new HashSet<>();
        Student s1= new Student(10,"我丢");
        Student s2= new Student(11,"通话");
        Student s3= new Student(11,"重地");
        Student s4= new Student(10,"我丢");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        h.add(s1);
        h.add(s2);
        h.add(s3);
        h.add(s4);
        System.out.println(h);
    }
}
