package d02_Method;
//【重载练习3】：用重载自定义打印输出方法，byte,short,int,long,float,double,boolean,char，还有String
//自带的print、println等等，通过按住Ctrl可以看到源代码，其实就是对多种数据类型的重载

public class MethodOverloadPrint {
    public static void main(String[] args) {
        myPrint(1);
        myPrint(1234567890000000000L);
        myPrint(1.5F);
        myPrint(0.333333333333333);
        myPrint(true);
        myPrint('a');
        myPrint("Hello World!");
    }

    public static void myPrint(byte num) {
        System.out.println("输出字节型：" + num);
    }

    public static void myPrint(short num) {
        System.out.println("输出short整型：" + num);
    }

    public static void myPrint(int num) {
        System.out.println("输出整型：" + num);
    }

    public static void myPrint(long num) {
        System.out.println("输出long整型：" + num);
    }

    public static void myPrint(float num) {
        System.out.println("输出单精度浮点型：" + num);
    }

    public static void myPrint(double num) {
        System.out.println("输出双精度浮点型：" + num);
    }

    public static void myPrint(boolean bool) {
        System.out.println("输出布尔型：" + bool);
    }

    public static void myPrint(char c) {
        System.out.println("输出字符型：" + c);
    }

    public static void myPrint(String str) {
        System.out.println("输出字符串型：" + str);
    }


}
