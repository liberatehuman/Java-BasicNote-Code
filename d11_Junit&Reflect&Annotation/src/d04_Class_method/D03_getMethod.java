package d04_Class_method;
/*
 * 【获取 Class 对象的成员变量们】：Method
 *  1、Method[] getMethods()：获取所有 public 修饰的成员方法们【包含 Object 类的公有方法】
 *  2、Method getMethod(String name, Class<?>... parameterTypes)：获取指定 public 修饰的成员方法
 *      - 传递：参数类型.class
 *
 *  3、Method[] getDeclaredMethods())：获取所有成员方法们（不考虑修饰符）
 *  4、Method getDeclaredMethod(String name, Class<?>... parameterTypes)：获取指定的成员方法（不考虑修饰符）
 *  --------------------
 *  ↓ ↓ ↓
 * 【方法的执行】：
 *  1、Object invoke(Object obj, Object... args)：执行方法，参数传递：方法名、参数类型.Class
 *
 *  2、String getName()：获取方法名
 *
 *  3、void setAccessible(boolean flag)：忽略访问权限修饰符的安全检查（暴力反射）
 * */

import java.lang.reflect.Method;

public class D03_getMethod {

    public static void main(String[] args) throws Exception {
        //获取 Class 对象
        Class<Person> personClass = Person.class;

        //1.getMethods
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);//除了本类 public 方法，还包括 Object 的方法

            //getName 获取方法名
            System.out.println(method.getName());
        }
        System.out.println("-------------");
        //2.getMethod
        Method method1 = personClass.getMethod("eat");//无参成员方法

        //invoke
        Person person=new Person();
        method1.invoke(person);

        Method method2 = personClass.getMethod("eat", String.class);//含参成员方法
        Object o = method2.invoke(person, "beef");
        System.out.println(o);
        //暴力反射
        method1.setAccessible(true);
    }
}
