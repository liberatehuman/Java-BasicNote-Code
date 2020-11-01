package d01_equals_Object_Objects;

/*
【equals 方法】：Object 类

Person类默认继承了Object类，可使用Object的equals方法

    public boolean equals(Object obj) {
        return (this == obj);
    }

        参数：Object obj，可传【任意对象】

        == ：比较运算符，返回布尔值true/false
            - 基本数据类型--比较的是【数值】
            - 引用数据类型--比较的是对象的【地址值】

        this：哪个对象调用的方法，方法中的this就是该对象
        obj：参数
 */

import java.util.Objects;

public class Demo {

    public static void main(String[] args) {

        Person p1 = new Person("古力娜扎", 23);
        Person p2 = new Person("迪丽热巴", 24);

        System.out.println(p1.equals(p2));// this是p1地址值

        p2 = p1;
        System.out.println(p1.equals(p2));

        //Person类重写equals方法后：可以比较对象的属性
        Person p3 = new Person("古力娜扎", 23);
        Person p4 = new Person("古力娜扎", 23);
        System.out.println(p3.equals(p4));

        //工具类 Objects.equals 方法：
        Person p5 = new Person(null, 23);
        boolean b = Objects.equals(p3, p5);
        System.out.println(b); //false，但不会抛出异常了

    }
}
