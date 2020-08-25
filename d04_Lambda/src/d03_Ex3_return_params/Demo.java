package d03_Ex3_return_params;
/*
 * 【 Lambda 表达式  练习2-2】：有参、有返回值的接口方法
 * */
public class Demo {

    public static void main(String[] args) {

        invokeCal(10, 20, new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        });

        invokeCal(50, 50, (int a, int b) -> {
            return a + b;
        });

    }

    public static void invokeCal(int a, int b, Calculator c) {
        int sum = c.calculate(a, b);
        System.out.println(sum);
    }
}
