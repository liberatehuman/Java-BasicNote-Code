package d14_varargParam可变参数;

/*
 * 【可变参数】：用于方法的参数类型确定，参数个数未知（灵活、通用）（JDK 1.5+）
 *
 *       - 底层：【数组】，调用方法时根据传参个数(0,1,...)，【创建对应长度的数组】存储数据
 *
 * 【使用】：
 *       修饰符 返回值 方法名(数据类型... 参数名) { }
 *
 * 【注】：
 *  1、一个方法的可变参数【至多一个】：× void method(int... a, String... b)
 *
 *  2、如果方法有多种参数类型，可变参数【放最后】：void method(String s, boolean b, int... a)
 *
 * 【终极用法】：method(Object... o)，可传各种类型参数
 * */
public class Demo {

    public static void main(String[] args) {

        int res1 = method();
        System.out.println(res1);

        int res2 = add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("求和方法：" + res2);

        methodKing(1, "abc", true, 8.8);//终极
    }

    //可变参数底层：数组
    public static int method(int... x) {
        System.out.println(x);//[I@3fee733d 数组的地址值（[：数组，I：int类型，@...：地址）
        return 0;
    }

    //加法器：实现 n 个整数求和
    public static int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //终极用法
    public static void methodKing(Object... o) {
        System.out.println("可变参数--终极用法");
    }
}
