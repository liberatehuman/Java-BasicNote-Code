package d16_Math;
/*
【java.lang.Math】：数学相关的工具【类】，里面提供了大量【静态方法】，完成数学运算相关操作

1、public static double abs(num)：取绝对值（有多种重载）
2、public static double ceil(num)：向上取整（ceil天花板）
3、public static double floor(num)：向下取整
4、public static long round(num)：四舍五入
5、Math.PI：精度允许范围内的圆周率常量（double）
*/
public class MathMethod {

    public static void main(String[] args) {

        //取绝对值
        System.out.println(Math.abs(-2.5));
        System.out.println(Math.abs(-0));
        System.out.println("——————");
        //向上取整
        System.out.println(Math.ceil(0.1));
        System.out.println(Math.ceil(0.9));
        System.out.println("——————");
        //向下取整
        System.out.println(Math.floor(2.9));
        System.out.println(Math.floor(2.1));
        System.out.println("——————");
        //四舍五入
        System.out.println(Math.round(1.4));
        System.out.println(Math.round(1.5));
        System.out.println("——————");
        //圆周率
        System.out.println(Math.PI);
    }
}
