package d04_Class_method;
/*
 * 【获取 Class 对象的成员变量们】：Field
 *  1、Field[] getFields()：获取所有 public 修饰的成员变量们
 *  2、Field getField(String name)：获取指定的 public 修饰的成员变量
 *
 *  3、Field[] getDeclaredFields()：获取所有成员变量们（不考虑修饰符）
 *  4、Field getDeclaredField(String name)：获取指定的成员变量（不考虑修饰符）
 *  --------------------
 *  ↓ ↓ ↓
 * 【操作成员变量】：
 *  1、void set(Object obj, Object value)：将成员变量设置为 value，参数传递所属的对象
 *
 *  2、Object get(Object obj)：获取成员变量的值，参数传递所属的对象【若获取非公有变量，需先暴力反射】
 *
 *  3、void setAccessible(boolean flag)：忽略访问权限修饰符的安全检查（暴力反射）
 * */

import java.lang.reflect.Field;

public class D01_getField {

    public static void main(String[] args) throws Exception {
        //获取 Class 对象
        Class<Person> personClass = Person.class;

        //1.getFields
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);//只能获取 public 修饰的成员变量
        }
        System.out.println("--------------");
        //2.getField
        Field field = personClass.getField("publicA");//只能获取 public 修饰的成员变量
        System.out.println(field);
        System.out.println("==============");

        //3.getDeclaredFields
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);//所有成员变量，不考虑修饰符
        }
        System.out.println("--------------");
        //4.getDeclaredField
        Field declaredField = personClass.getDeclaredField("privateD");
        System.out.println(declaredField);
        System.out.println("==============");

        //5.set
        Person person = new Person();
        field.set(person, "aaa");
        System.out.println(person);

        //6.get
        declaredField.setAccessible(true);//忽略访问权限修饰符的安全检查

        Object o = declaredField.get(person);//可以获取 private 成员变量
        System.out.println("获取 privateD 的值：" + o);//若无权限且未暴力反射，抛 IllegalAccessException
    }
}
