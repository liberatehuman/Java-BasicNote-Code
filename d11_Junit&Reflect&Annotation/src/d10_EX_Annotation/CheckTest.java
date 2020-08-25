package d10_EX_Annotation;
/*
 * 【案例】：简单的测试框架
 *
 *       当 main 方法执行后，自动执行添加 Check 注解的方法，并检测异常情况，记录到 bug.txt 文件中
 *
 * 【总结】：
 *  1、大多数时候是使用注解，很少定义注解
 *
 *  2、使用注解的是：
 *          - 编译器（识别注解并使用）
 *          - 解析程序（使用注解的程序，如CheckTest）
 *
 *  3、注解不是程序的一部分，而是一种【标签】
 * */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CheckTest {

    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();//本次重点不在配置文件，先在此创建对象
        Class testClass = calculator.getClass();//获取对象的字节码文件

        Method[] methods = testClass.getMethods();//获取类中的所有方法

        int bugTimes = 0;//bug 次数

        //缓冲字节输出流记录 bug，参数绑定目的地
        BufferedWriter br = new BufferedWriter(new FileWriter("d11_Junit&Reflect&Annotation/bug.txt"));

        //遍历所有方法
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {//若方法被添加了指定注释
                try {
                    method.invoke(calculator);//执行方法
                } catch (Exception e) {//处理异常（记录bug到文件）
                    bugTimes++;//计数加一
                    br.write(method.getName() + " 方法异常\r");
                    br.write("异常名称：" + e.getCause().getClass().getName() + "\r");
                    br.write("异常原因：" + e.getCause().getMessage() + "\r");
                    br.write("-----------------------\r");
                }
            }
        }

        br.newLine();
        br.write("异常个数：" + bugTimes + "\r");

        br.close();
    }
}
