package d15_Arrays;

//对一个混乱随机的字符串进行升序排列，并【逆序】打印

import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {

        String str = "98y7Aj!s";
        //先转成char[]字符数组
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {  // 数组名.forr+回车：直接倒序循环
            System.out.print(chars[i] + " ");
        }
    }
}
