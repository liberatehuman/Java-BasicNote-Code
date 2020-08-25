package d11_Random;

// 在闭区间内产生一个随机数，手动输入进行猜测，直到猜对为止

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Random rand = new Random();
        int randNum = rand.nextInt(20) + 1;

        Scanner sc = new Scanner(System.in);

        while (true) { //循环次数不确定，所以用死循环
            System.out.print("请输入猜想的数字：");
            int guessNum = sc.nextInt(); //输入也应在循环体中，因为如果猜不对的话，要一直输入

            if (guessNum < randNum) {
                System.out.print("小了，再试试：");
            } else if (guessNum > randNum) {
                System.out.print("大了，再试试");
            } else if (guessNum == randNum) {
                System.out.println("恭喜你猜对了！");
                break; //因为是死循环！当猜中是要手动结束循环！
            }
        }
        System.out.println("游戏结束");

    }
}
