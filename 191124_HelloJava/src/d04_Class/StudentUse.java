package d04_Class;
/*
【类的使用】三步骤：

1、导包：指出要使用的类及其所在位置。
import 包路径.类名
【注】：若当前程序与需要使用的类在一个package下，导包语句可省略

2、创建：将类实例化为对象
类名 对象名 = new 类名();

3、使用：
对象名.成员变量名
对象名.成员方法名
*/

public class StudentUse {

    public static void main(String[] args) {

        Student std = new Student();
        System.out.println(std.name); //null。和数组一样，创建时有一个默认值
        System.out.println(std.age); //0
        System.out.println("———————");

        //成员变量赋值
        std.name = "东东";
        std.age = 23;
        System.out.println(std.name);
        System.out.println(std.age);
        System.out.println("———————");

        //成员方法的使用
        std.eat();
        std.sleep();
        std.study();
    }
}
