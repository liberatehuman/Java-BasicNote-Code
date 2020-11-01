package d04_Class;
/*
【注】：
1、成员变量直接定义在类中，在成员方法外
2、成员方法不要写static关键字
*/

public class Student {
    //成员变量（属性）
    String name;
    int age;

    //成员方法（行为）
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void study(){
        System.out.println("学习");
    }
}
