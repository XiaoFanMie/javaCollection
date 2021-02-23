package com.ff.javaList.Day4;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int num;
    private String use;

    public Student(int num, String use) {
        this.num = num;
        this.use = use;
    }

    //自己类中重写hashCode(),根据内容计算hash值
    //当hash值相同时,调用equals,判断内容是否相同
    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        Student student = (Student) o;
        return num == student.num &&
                Objects.equals(use, student.use);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, use);
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", use='" + use + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.num-o.num;
    }
}
