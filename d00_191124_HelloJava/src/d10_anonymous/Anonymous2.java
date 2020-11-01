package d10_anonymous;

import java.util.Scanner;

public class Anonymous2 {

    public static void main(String[] args) {
    //1.匿名对象作为参数：

        //一般写法传参
        //Scanner sc = new Scanner(SystemDemo.in); //先赋值
        //methodParam(sc);

        //用匿名对象传参
        methodParam(new Scanner(System.in)); //直接new

    //2.匿名对象作为返回值
        Scanner sc = methodReturn(); //返回匿名对象地址
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc) {
        int i = sc.nextInt();
        System.out.println("输入的是：" + i);
        System.out.println("————————————");
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in); //直接new匿名对象作为返回值
    }
}
