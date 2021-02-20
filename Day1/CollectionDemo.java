package com.ff.javaList.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class CollectionDemo {

    /*
    集合中默认可以存储任意数据类型,建议使用泛型,存储同一种类型的数据
     */
    public static void main(String[] args) {
        //String类型,只能传入String类型数据
        Collection<String> c = new ArrayList<String>();
        c.add("abc");//添加数据
        c.add("ab");
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        //c.clear();//清空数组
        System.out.println(c.remove("a"));//删除指定元素,有则返回true
        System.out.println(c.remove("f"));//没有返回false
        System.out.println(c.contains("a"));//是否包含
        System.out.println(c.isEmpty());//是否为空
        //有条件的删除
        c.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("a");//如果以a开头的都被删除
            }
        });
        System.out.println(c);
        c.stream().forEach((a)-> System.out.println(a));
        /*
        集合转数组
         */
        Object [] obj  =c.toArray();
        String [] str = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(obj));
        /*
        数组转集合
         */
        Collection c1=Arrays.asList(1,2,3,4);
        ArrayList alist = new ArrayList<>(c1);
        System.out.println(alist.remove(1));
        System.out.println(alist);
       test(1,2,3,4);
    }
    /*
    int...a 可变长度的参数,本质是一个数组
    一个参数列表中只能有一个可变长度的参数,并且只能放在参数列表的末尾
     */
    public static void test(int a,int...b){
        System.out.println(a);
        System.out.println(Arrays.toString(b));
    }
}
