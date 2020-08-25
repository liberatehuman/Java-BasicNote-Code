package d09_parseAnnotation;
/*
 * 【解析（使用）注解】：主要是获取注解中定义的属性值（一般用于配置阶段）
 *
 * 【步骤】：（反射案例）
 *  1、获取注解定义位置的对象（类/成员变量/方法）
 *  2、获取指定注解对象（其实是在内存中生成了一个该注解接口的实现类对象）
 *  3、调用注解的抽象方法（实现类对象重写的方法）获取配置的属性值
 * */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Property(className = "d09_parseAnnotation.Person", methodName = "play")
public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1 获取本类的字节码文件
        Class<ReflectDemo> thisClass = ReflectDemo.class;
        //1.2 根据@Target，从中类的位置获取注解对象
        Property annotation = thisClass.getAnnotation(Property.class);//参数传递指定注解
        /* （1.2 其实是在内存中生成了一个该注解接口的实现类对象）
        public class PropertyImpl implements Property{
            @Override
            public String className() {
                return "d09_parseAnnotation.Person";
            }
            @Override
            public String methodName() {
                return "play";
            }
        }
        */
        //2.获取注解对象的属性值
        String className = annotation.className();//全类名（调用的是实现类对象的方法）
        String methodName = annotation.methodName();//方法名（调用的是实现类对象的方法）
        System.out.println("配置加载完毕");

        //3.加载类进内存（反射）
        Class<?> aClass = Class.forName(className);
        //4.创建对象
        Object o = aClass.newInstance();
        //5.获取方法
        Method method = aClass.getMethod(methodName);
        //6.执行方法
        method.invoke(o);
    }
}
