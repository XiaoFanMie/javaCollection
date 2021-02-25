package Praice.practice;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList {
    public static void main(String[] args) {
        Random r= new Random();
        ArrayList alist= new ArrayList(10);
        for (int i = 0; i < 100; i++) {
            int x=r.nextInt(20)+1;
            if (true!=alist.contains(x)){
                alist.add(x);
            }
            if (alist.size()==10){
                break;
            }
        }
        System.out.println(alist);
    }
}
