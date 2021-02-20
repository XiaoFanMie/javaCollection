package com.ff.javaList.Day1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
泛型:类型参数化,参数化类型,将类型作为参数传入
<任意的大写字母,可以有多个>
泛型的传入的类型只能是引用类型
如果没有写,默认Object
 */
public class TypeDemo<T,E> {
    T name;
    E color;

    public T test(E e){
        return null;
    }
    public static void main(String[] args) {

        TypeDemo<String,Integer>t = new TypeDemo();
        t.test(1);
        t.color=1;
        t.name="Str";


        ArrayList lis = new ArrayList();
        lis.add("a");
        lis.add(1);
        lis.add(true);

        for (int i = 0; i < lis.size(); i++) {
            Object sc = lis.get(i);
            if (sc instanceof String) {
                String s1 = (String) sc;
            }
            if (sc instanceof Integer) {
                Integer s2 = (Integer) sc;
            }
            if (sc instanceof Boolean) {
                Boolean s3 = (Boolean) sc;
            }

        }

    }
}



