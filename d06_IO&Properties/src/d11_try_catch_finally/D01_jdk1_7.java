package d11_try_catch_finally;
/*
 * 【流的异常处理 1：try catch finally（jdk 1.7-）】
 *
 *       try {
 *           可能产生异常的代码
 *       } catch (异常类型 变量名) {
 *           异常处理逻辑
 *       } finally {
 *           必定执行的代码
 *           常用于流的【资源释放】：确保即使异常也不占用资源
 *       }
 * */

import java.io.FileWriter;
import java.io.IOException;

public class D01_jdk1_7 {

    public static void main(String[] args) {

        //扩大流对象作用域，确保 finally 内资源释放可执行
        FileWriter fw = null;

        //可能出错的代码块
        try {
            fw = new FileWriter("GF//a.txt", true);//此处添加数据源
            fw.write("Hello\r");
        } catch (IOException e) {
            System.out.println(e);
        }

        //必定执行代码块：用于【资源释放】（close）
        finally {

            //添加非空条件（否则 null 无法调用方法，抛 NullPointerException）
            if (fw != null) {

                //close 编译异常 IOException，必须处理（throws/try catch）
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
