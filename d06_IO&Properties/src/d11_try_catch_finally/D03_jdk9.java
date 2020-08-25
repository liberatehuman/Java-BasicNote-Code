package d11_try_catch_finally;
/*
 * 【流的异常处理 3：try catch（jdk 9 新特性）】
 *
 * 【格式】：
 *
 *       A a = new A(...);
 *       B b = new b(...);
 *
 *       try (A; B) {
 *           可能产生异常的代码
 *       } catch (异常类型 变量名) {
 *           异常处理逻辑
 *       }
 *
 *  - 由于创建流对象在 try catch 代码块之外，【仍需声明异常】（不如 jdk 7 简洁）
 * */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D03_jdk9 {

    public static void main(String[] args) throws IOException {

        //创建流对象
        FileInputStream fis = new FileInputStream("GF//a.txt");
        FileOutputStream fos = new FileOutputStream("GF//a_1.txt");

        try (fis; fos) {
            //可能产生异常的代码
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        //已自动释放资源
        //fos.write(1);//IOException: Stream Closed
    }
}
