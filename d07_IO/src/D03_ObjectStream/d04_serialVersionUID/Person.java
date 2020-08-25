package D03_ObjectStream.d04_serialVersionUID;
/*
 * 【 InvalidClassException 】：序列号，序列化到反序列化成功的条件
 *
 *  - 序列化后，对象的类【.class 文件发生改变】，导致 .class 的【序列号 serialVersionUID 变化】
 *
 *  - 从而 .class 文件的 serialVersionUID 与文件内的 serialVersionUID 值不一致，导致反序列化失败
 *
 * 【过程】：
 *       Person.java --javac编译-->【Person.class】-->
 *
 *       若Person实现了Serializable，那么.class获得序列号 --> 序列化 --> 目的文件内获得序列号 -->
 *
 *       若.class与文件内的序列号一致 --> 反序列化成功（反之则 InvalidClassException）
 *
 * 【解决】：
 *      类中手动添加 serialVersionUID 序列号变量，并用【static】、【final】、【long】修饰（值任意）
 * */

import java.io.Serializable;

public class Person implements Serializable {

    //手动添加序列号
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
