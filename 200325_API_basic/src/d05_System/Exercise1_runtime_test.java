package d05_System;

/*
【1.测试程序运行时长】

    用System.currentTimeMillis()当前时刻ms值，测试for循环10w次的运行时长
*/

public class Exercise1_runtime_test {

    public static void main(String[] args) {

        int a=0;

        long start=System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            a++;
        }

        long end=System.currentTimeMillis();

        System.out.println("10w次for循环耗时："+(end-start)+"ms");
    }
}
