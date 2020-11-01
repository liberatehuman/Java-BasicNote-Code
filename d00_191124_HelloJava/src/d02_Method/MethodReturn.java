package d02_Method;

public class MethodReturn {
    public static void main(String[] args) {
        sum1(2, 3);
        System.out.println("——————————————");
        System.out.println(sum1(2, 3));
        System.out.println("——————————————");
        int c = sum1(2, 3);
        System.out.println(c);
        System.out.println("——————————————");

        sum2(3, 3);  //返回值类型为void时，只能单独调用，不可打印调用、赋值调用
        //若打印调用，相当于 SystemDemo.out.println(void); 错误
        //若赋值调用，相当于 int d=void; 右边为空错误。改写为 void d=void; 大错特错
    }

    public static int sum1(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void sum2(int a, int b) {
        for (int i = 0; i < 3; i++) {
            System.out.println(a + b);
        }
    }
}
