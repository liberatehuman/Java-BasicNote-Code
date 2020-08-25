package d05_try_catch;

/*
 * 【异常处理方式 2：try...catch 捕获异常】：抛出异常对象后，自己捕获进行处理
 *
 * 【格式】：
 *
 *       try {
 *           可能产生异常的代码
 *       } catch (异常类名 变量名) {
 *           异常处理逻辑，即如何处理异常
 *           一般工作中，会将异常信息记录到一个日志中
 *       }
 *       ...
 *         catch (异常类名 变量名) {
 *           ...
 *       }
 *
 * 【注】：
 * 1、try 中可能抛出多个异常对象，则可以有多个 catch 进行捕获处理
 *
 * 2、try 若产生异常 -> catch 执行异常处理逻辑 -> 执行 try...catch 之后的代码
 *    try 若没有异常 -----(catch 不执行)------> 执行 try...catch 之后的代码
 * */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {

        try {
            readFile("C:/a.doc");
        } catch (IOException e) {//一般 try 抛出什么类型的异常对象，参数就是什么异常类型变量
            System.out.println("catch - 文件类型不对");
        }

        System.out.println("后续代码");//执行
    }

    public static void readFile(String path) throws IOException {
        if (!path.endsWith(".txt")) {
            throw new IOException("传递的文件类型不对");
        }
        System.out.println("传递的文件OK");
    }
}
