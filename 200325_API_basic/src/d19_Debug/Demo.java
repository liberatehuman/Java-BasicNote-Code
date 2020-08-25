package d19_Debug;
/*
* 【IDE - Debug 功能】：让程序逐行执行，查看程序运行过程，进行调试程序
*
* 【使用方法】：
* 1、行号右侧单击添加断点（一般设置在 bug 位置）
* 2、右键 Debug 程序
* 3、程序停留在断点处，等待指令
*
* 【执行操作】：
*       F8 ：逐行执行
*       F7 ：进入方法中
*       shift + F8：跳出方法
*       F9：跳至下个断点
*       cmd + F2：退出Debug，终止程序
*       Console：查看控制台
*
* */
public class Demo {

    public static void main(String[] args) {

        //可添加断点查看变量地址和值等情况
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);

        for (int i = 0; i < 5; i++) {//可添加断点查看for循环执行情况
            System.out.println(i);
        }

        myMethod();//可在方法添加断点
    }

    private static void myMethod() {
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
    }
}
