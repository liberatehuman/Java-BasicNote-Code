package d13_String;

//【字符串练习2】：键盘输入一个字符串，统计其中大写字母、小写字母、数字和其他字符的个数

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int upper = 0;
        int lower = 0;
        int num = 0;
        int other = 0;

        byte[] array = str.getBytes(); //也可以用.toCharArray()

        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 65) && (array[i] <= 90)) { //用toCharArray()的话，就直接和'public_a'~'z'、'A'~'Z'..
                upper++;
            } else if ((array[i] >= 97) && (array[i] <= 122)) {
                lower++;
            } else if ((array[i] >= 48) && (array[i] <= 57)) {
                num++;
            } else {
                other++;
            }
        }
        System.out.println("大写字母个数：" + upper);
        System.out.println("小写字母个数：" + lower);
        System.out.println("数字个数：" + num);
        System.out.println("其他个数：" + other);
    }
}
