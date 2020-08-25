package d07_MyException;

/*
 * 【自定义异常类练习】：输入想要注册的用户名，若已存在则抛出异常
 * */

import java.util.Scanner;

public class RegisterExceptionDemo {

    //数组保存已注册的用户名（一般保存在数据库）
    static String[] usernames = {"张三", "李四", "王五"};//成员变量 static

    public static void main(String[] args) {
        System.out.println("请输入想要注册的用户名：");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();//获取用户名

        checkUsername(username);
    }

    public static void checkUsername(String yourname) {

        for (String s : usernames) {//遍历用户名数组
            if (s.equals(yourname)) {
                try {
                    throw new RegisterException("该用户名已被注册！");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//结束方法，否则抛异常同时还会执行后续代码
                }
            }
        }

        System.out.println("注册成功！");
    }

}
