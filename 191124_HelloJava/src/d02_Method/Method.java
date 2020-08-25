package d02_Method;

/*
方法定义格式：
public static void 方法名(){
    方法体
}

调用格式：
方法名();

【注】：
1、方法定义顺序无所谓
2、方法定义是并列的，不能嵌套
3、定义后不会执行，要执行一定要调用

 */
public class Method {
    public static void main(String[] args) {
/*      输出一个5×10的*矩阵
        for (int i = 0; i < 5; i++) {   //5.for自动生成for循环
            for (int j = 0; j < 10; j++) {
                SystemDemo.out.print('*');  //print是不换行输出
            }
            SystemDemo.out.println();       //每次换行
        }*/

        printMethod();  //调用
    }

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}