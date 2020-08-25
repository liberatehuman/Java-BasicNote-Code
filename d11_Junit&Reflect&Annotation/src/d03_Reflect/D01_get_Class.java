package d03_Reflect;
/*
* 【反射】：将类的各组成部分封装为【Class 类对象】（包含成员变量数组、构造方法数组、成员方法数组）
*
 *      "像一面镜子，反射出该类的成员属性"
*  -------------------------
* 【获取 Class 对象方式】：
*  1、Class.forName("包名.类名")：（Class 类的静态方法）
*
*       -  多用于【配置文件】，将全类名定义在 .properties 配置文件中，读取文件就能加载类
*
*  2、类名.class：（类调用 class 属性）
*
*       - 多用于【参数的传递】（如含参的构造方法、成员方法参数使用 类名.class）
*
*  3、对象.getClass()：（Object 类通用方法）
 *
*       - 多用于对象的获取其 .class【字节码文件】的方式
*
* 【重点】：同一 .class 在运行过程中只会【被加载一次】，无论何种方式获取 Class 对象，都是同一个（地址值相同）
* */
public class D01_get_Class {

    public static void main(String[] args) throws Exception {

        //1.Class.forName
        Class classPerson1 = Class.forName("d03_Reflect.Person");
        System.out.println(classPerson1);//class d03_Reflect.Person

        //2.类名.class
        Class personClass = Person.class;
        System.out.println(personClass);//class d03_Reflect.Person

        //3.对象.getClass()
        Person person=new Person();
        Class personClass1 = person.getClass();
        System.out.println(personClass1);//class d03_Reflect.Person


        //比较三个 Class 对象是否相等
        System.out.println(classPerson1==personClass);//true
        System.out.println(classPerson1==personClass1);//true，同一 .class 的 Class 对象相同

        Class pigClass = Pig.class;
        System.out.println(personClass==pigClass);//false，不同.class文件 Class 对象不同
    }
}
