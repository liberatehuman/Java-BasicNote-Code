package d05_Recursion_Ex;

/*
 * 【使用递归必须明确】：
 *       1、递归的结束条件
 *       2、递归的目的
 * ---------------------
 *
 * 【递归练习 1：求 1-100 之间整数的和】
 *
 * 【分析】：
 *  1、结束条件：
 *       若 1 + 2 + ... + 100：n>100
 *       若 100 + 99 + ... + 1：n==1
 *
 *  2、目的：
 *       获取返回的下一个数字 sum(n+1) 或 sum(n-1)
 *
 *  【注】：
 *       由于递归会频繁的调用方法和返回方法，即频繁入栈出栈，效率低下
 *       一般对于求和，不推荐递归，用 for 循环即可
 * */
public class D01_sum {

    public static void main(String[] args) {

        System.out.println(sum(1));
    }


    public static int sum(int n) {
        if (n > 100) {
            return 0;
        }
        return n + sum(n + 1);
    }

}
