package d09_Scanner;

//键盘输入三个数，求最大值

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数：");
        int a = sc.nextInt();
        System.out.print("输入第二个数：");
        int b = sc.nextInt();
        System.out.print("输入第三个数：");
        int c = sc.nextInt();
        //用三元运算符非常简单！！！
        int t=a<b?b:a;
        int max=t<c?c:b;
        System.out.println("最大值为："+max);
//        if(public_a<protected_b){
//            if (protected_b<c){
//                SystemDemo.out.println("最大值为"+c);
//            }else {
//                SystemDemo.out.println("最大值为"+protected_b);
//            }
//        }else {
//            SystemDemo.out.println("最大值为："+public_a);
//
//        }

    }

}
