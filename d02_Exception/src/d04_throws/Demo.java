package d04_throws;
/*
 * 【异常处理方式 1：关键字 throws 】：抛给别人处理
 *
 * 【作用】：
 * 1、当方法内部 throw 异常对象时，若属于【编译异常】则必须处理该异常对象
 * 2、在方法声明 throws 异常对象，抛给方法的调用者处理，最终交给 JVM 处理（中断处理）
 *
 * 【格式】：
 *
 *       修饰符 返回值类型 方法名(参数列表) throws AaException, BbException {
 *           throw new AaException("原因a");
 *           throw new BbException("原因b");
 *           ...
 *       }
 *
 * 【注】：
 * 1、throws 关键字必须写在【方法声明处】
 *
 * 2、throws 关键字后面声明的异常必须是【Exception或其子类】
 *
 * 3、当方法内部 throw 多个异常对象时，必须在声明时 throws 对应异常
 *
 *       若声明的多个异常有【继承关系】，直接声明父类即可
 *       FileNotFoundException extends IOException extends Exception
 *
 * 4、当【调用】一个声明了抛出异常的方法时，必须处理异常（throws/try catch）
 *
 * 【缺点】：throws 最后交给了JVM 中断处理，影响后续代码的执行
 * */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws Exception {//main调用了声明异常的readFile，必须处理

        //readFile("Users/ZHD/a.txt");
        readFile("Users/ZHD/Desktop/a.tx");

        System.out.println("后续代码");//若抛异常，则不执行
    }

    //public static void readFile(String path) throws FileNotFoundException, IOException {
    //public static void readFile(String path) throws IOException {//直接声明父类
    public static void readFile(String path) throws Exception {//直接声明根类即可

        if (!path.equals("Users/ZHD/Desktop/a.txt")) {
            throw new FileNotFoundException("传递的文件路径不对");//FileNotFoundException属于编译异常，throws
        }
        if (!path.endsWith(".txt")) {
            throw new IOException("传递的文件类型不对");
        }
        System.out.println("传递的文件OK");
    }
}
