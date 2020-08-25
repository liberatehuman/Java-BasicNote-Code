package d13_Set_HashSet;
/*
 * 【Set集合存放自定义元素类型】
 *
 * 原本自定义Person类的不同对象均可放入Set中
 *
 * 现要求【不允许重复】元素：name 、age 均相同，则认为重复
 *
 * 【实现方法】：
 *
 *      将放入Set集合的元素--Person类：重写 hashCode 和 equals 方法（Object类的方法）
 * */

import java.util.HashSet;

public class HashSet_Person {

    public static void main(String[] args) {

        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("鸣人", 20);
        Person p2 = new Person("鸣人", 20);
        Person p3 = new Person("鸣人", 21);
        Person p4 = new Person("佐助", 20);

        //Set调用add时，add会调用元素的hashCode和equals方法，要保证元素不重复，元素必须重写这两个方法
        set.add(p1);
        set.add(p2);//p2和p1的name、age均相同，则存储false
        set.add(p3);
        set.add(p4);

        //重写 hashCode 后
        System.out.println(p1.hashCode());//39529918
        System.out.println(p2.hashCode());//39529918，name age相同，则hashCode相同
        System.out.println(p3.hashCode());//39529919
        System.out.println(p4.hashCode());//20169116

        //重写 equals 后
        System.out.println(p1.equals(p2));//name age均相同，认为两个元素相同
        System.out.println(p1.equals(p3));//name 相同，age不同，认为两个元素不同
        System.out.println(set);
        //[Person{name='鸣人', age=21}, Person{name='鸣人', age=20}, Person{name='佐助', age=20}]

    }
}
