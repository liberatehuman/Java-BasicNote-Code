package D03_ObjectStream.d01_ObjectOutputStream;

/*
 * 【注】：要进行序列化/反序列化的类必须实现 Serializable 接口，否则抛异常：
 *
 *      java.io.NotSerializableException，不可进行序列化/反序列化
 *
 *      - Serializable 是标记型接口，无内容
 *      - 当序列化/反序列化时，会检测该类是否有该标记
 * */

import java.io.Serializable;

public class Person implements Serializable {//必须实现 Serializable 接口

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
