package d09_Scanner;

//键盘输入两个数，并求和

import java.util.Scanner; //导包语句可以不用自己写，在main中输入Sca回车

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数：");
        int a = sc.nextInt();
        System.out.print("输入第二个数：");
        int b = sc.nextInt();
        System.out.print("和为：" + (a + b));
    }
}
