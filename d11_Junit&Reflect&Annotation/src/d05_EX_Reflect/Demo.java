package d05_EX_Reflect;
/*
 * 【案例】：
 *       写一个框架，在【不改变本 Demo 类的代码】前提下，可以实现【创建任意类的对象】，并【执行其中任意方法】
 *
 * 【实现】：配置文件 + 反射
 *
 * 【步骤】：
 *  1、将需要创建的对象的【全类名】和要执行的【方法名】定义在【.properties 配置文件】中
 *  2、在程序中加载配置文件
 *  3、使用反射技术加载类文件进内存
 *
 *  4、创建对象
 *  5、执行方法
 *
 *      - 一般创建对象执行方法都要自己 new，且创建不同对象需要修改代码，若代码复杂庞大，则牵一发动全身
 *      - 使用反射技术，框架代码本身无需修改，只需修改配置文件中的内容即可，简单且可扩展性强
 * */

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {

    public static void main(String[] args) throws Exception {

        //1.加载配置文件
        //1.1 创建 Properties 对象
        Properties properties = new Properties();
        //1.2 获取本类所在目录下的配置文件
        ClassLoader classLoader = Demo.class.getClassLoader();//从本类获取一个类加载器
        InputStream is = classLoader.getResourceAsStream("pro.properties");//绑定配置文件名，用输入流接收
        //1.3 load 加载配置文件，转为集合
        properties.load(is);//内存 <- 硬盘

        //2.获取配置文件信息
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3.加载类进入内存（反射技术）
        Class aClass = Class.forName(className);

        //4.创建对象
        Object o = aClass.newInstance();

        //5.执行方法
        Method method = aClass.getMethod(methodName, String.class);//获取含参 eat 方法
        Object result = method.invoke(o, "chicken");//传参并执行（有返回值）
        System.out.println(result);

    }
}
