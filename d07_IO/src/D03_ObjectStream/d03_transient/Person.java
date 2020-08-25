package D03_ObjectStream.d03_transient;
/*
 * 【 transient 关键字】：瞬态关键字
 *
 *       - 被 transient 修饰的成员变量，不可被序列化（唯一作用）
 *
 *  -------------
 * 【 static 关键字】：静态关键字
 *
 *       -【静态优先于非静态】加载到内存中，静态优先于对象（对象是非静态的）
 *
 *       - 所以被 static 修饰的成员变量，当然也不可被序列化
 * */

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private transient int age;///age 不能被序列化，使用对象打印出来是 0
    //private static int age;//同上

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
