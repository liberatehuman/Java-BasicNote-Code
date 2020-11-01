package d09_Scanner;
/*
Scanner类：实现键盘输入数据到程序中的功能

【引用类型（非基本数据类型）】使用的三步骤：

1、导包：import 包路径.类名;
若要使用的目标类和当前类在同一包下，导包语句可略
只有java.lang包下的内容不需要导包，其余均需要import语句

2、创建：类名 对象名 = new 对象名();

3、使用：对象名.成员方法名();
*/

//1.导包
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        //2.创建
        Scanner sc = new Scanner(System.in); //自带类的参数情况参考API。SystemDemo.in表示从键盘输入

        //3.使用
        String str = sc.next(); //从键盘输入一个字符串，sc.next()
        System.out.println("输入的字符串是：" + str);

        int num = sc.nextInt(); //从键盘输入一个数值，sc.nextInt()
        System.out.println("输入的数值是：" + num);
    }

}
