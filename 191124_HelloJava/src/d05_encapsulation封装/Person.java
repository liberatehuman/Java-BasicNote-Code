package d05_encapsulation封装;
/*
【面向对象三大特征】之【封装】：将一些细节信息隐藏起来，对外界不可见（如方法内容可以点缩略符省略）

 1、方法就是一种封装

 2、关键字private也是一种封装

        访问private修饰的成员变量，需要【间接访问】（防止不合理的参数被设置进来）
*/
public class Person {

    String name;
    private int age; //private修饰age，本类当中仍可任意访问，但类外需要【间接访问】

    public void show() {
        System.out.println(name + "今年" + age + "岁");
    }

    //【间接访问】private变量，就是定义一对Getter/Setter方法
    //命名规则必须为：setXxx，getXxx
    public void setAge(int num) { //对于Setter，不能有返回值，参数类型和成员变量对应
        if (num > 0 && num <= 100) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    public int getAge() { //对于Getter，不能有参数，返回值类型和成员变量对应
        return age;
    }
}
