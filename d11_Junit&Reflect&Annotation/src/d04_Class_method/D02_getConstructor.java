package d04_Class_method;
/*
 * 【获取 Class 对象的构造方法们】：java.lang.reflect.Constructor
 *  1、Constructor<?>[] getConstructors()：获取所有 public 构造方法们
 *  2、Constructor<T> getConstructor(Class<?>... parameterTypes)：获取指定 public 构造方法
 *      - 传递：参数类型.class
 *
 *  3、Constructor<?>[] getDeclaredConstructors()：获取所有构造方法们（不考虑修饰符）
 *  4、Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：获取指定参数情况的构造方法
 *  --------------------
 *  ↓ ↓ ↓
 * 【创建对象】：
 *  1、Class 类方法创建无参对象：
 *          T newInstance()：无参构造建议使用
 *
 *  2、Constructor 类方法创建对象
 *          T newInstance(Object ... initargs)：参数为可变参数
 *
 *  3、void setAccessible(boolean flag)：忽略访问权限修饰符的安全检查（暴力反射）
 * */

import java.lang.reflect.Constructor;

public class D02_getConstructor {

    public static void main(String[] args) throws Exception {
        //获取 Class 对象
        Class<Person> personClass = Person.class;

        //1.getConstructors
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("--------------");
        //2.getConstructor
        Constructor<Person> constructor = personClass.getConstructor(
                String.class, String.class, String.class, String.class);
        System.out.println(constructor);
        System.out.println("==============");

        //创建对象
        Person person1 = personClass.newInstance();//Class 类的无参构造方法创建对象
        System.out.println(person1);

        Person person2 = constructor.newInstance("", "", "", "D");//Constructor类创建对象（可变参数）
        System.out.println(person2);

        //暴力反射
        constructor.setAccessible(true);
    }
}
