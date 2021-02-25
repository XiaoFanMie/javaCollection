package Praice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Test {
    private int flag = 0;
    ArrayList<User> c = new ArrayList();

    public static void main(String[] args) {
        Test t = new Test();
        out:
        for (int i = 0; ; i++) {
            System.out.println("选择操作功能:1.注册,2.登录");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    t.Fundation1();
                    continue out;
                case 2: {
                    int s = t.Fundation2(t.flag);
                    if (s == 1) {
                        System.out.println("登陆成功");
                        break;
                    } else if (s == 0) {
                        System.out.println("用户或密码输入错误");
                    }
                }
            }
        }
    }

    public void Fundation1() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入注册手机号:");
        String num = input.next();
        System.out.println("请输入密码");
        String passWord = input.next();
        User u = new User(num, passWord);
        c.add(u);
        System.out.println(c);
        System.out.println("注册成功");

    }

    public int Fundation2(int flag) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入手机号:");
        String num1 = input.next();
        System.out.println("请输入密码");
        String passWord1 = input.next();
        for (User s:c) {
            if (s.getNum().equals(num1)&&s.getPassWord().equals(passWord1)){
                System.out.println("登陆成功");
                return 1;
            }
        }
        return 0;
    }
}
