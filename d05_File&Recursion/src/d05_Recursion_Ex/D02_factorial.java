package d05_Recursion_Ex;

/*
 * 【递归练习 2：求 5 的阶乘】
 * */
public class D02_factorial {

    public static void main(String[] args) {

        System.out.println(factorial(5));// 5!=120
    }


    public static int factorial(int n) {
        if (n == 0 || n == 1) {// 0!=1!=1
            return 1;
        }
        return n * factorial(n - 1);
    }
}
