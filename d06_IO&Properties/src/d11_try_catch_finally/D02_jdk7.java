package d11_try_catch_finally;
/*
 * 【流的异常处理 2：try catch（jdk 7 新特性）】
 *
 * 【格式】：
 *
 *       try (定义流对象A; 定义流对象B; ...) {
 *           可能产生异常的代码
 *       } catch (异常类型 变量名) {
 *           异常处理逻辑
 *       }
 *
 *  - 流对象【作用域：try 代码块内】，执行完try，【自动释放流对象，无需手动释放资源】
 *
 * */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D02_jdk7 {

    public static void main(String[] args) {

        try (//创建流对象区域
             FileInputStream fis = new FileInputStream("GF//a.txt");
             FileOutputStream fos = new FileOutputStream("GF//a_1.txt");) {

            //可能产生异常的代码
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        //无需手动资源释放
    }
}
