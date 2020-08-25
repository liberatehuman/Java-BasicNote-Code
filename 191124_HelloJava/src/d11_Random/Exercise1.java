package d11_Random;

// 取int类型[1,n]范围随机数

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("[1,n]内的随机数：" + (rand.nextInt(sc.nextInt()) + 1));
    }
}
