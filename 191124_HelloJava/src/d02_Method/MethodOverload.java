package d02_Method;

//【重载】：实现【相同功能】的不同方法，【方法名相同，参数列表不同】
/*
【重载的有关因素】：
1、参数个数不同
2、参数类型不同
3、参数多类型的顺序不同

【无关因素】：
1、参数名
2、返回值类型
3、其他诸如public修饰符、static关键字等
*/
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(2, 2));
        System.out.println(sum(2, 2, 2));
        System.out.println(sum(2, 2, 2, 2));
    }

    public static int sum(int a, int b) {
        System.out.print("2个数求和：");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.print("3个数求和：");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.print("4个数求和：");
        return a + b + c + d;
    }

}