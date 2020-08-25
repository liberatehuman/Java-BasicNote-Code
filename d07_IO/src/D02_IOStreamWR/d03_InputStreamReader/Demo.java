package D02_IOStreamWR.d03_InputStreamReader;
/*
 * 【java.io.InputStreamReader 类】extends Reader：字节流转换为字符流
 *
 *       - 用指定 charset 将字节转换成字符（解码过程）
 *
 * （共性方法）：
 *     int read()：从输入流中读取数据的【下一个字符】
 *     int read(char[] c)：从输入流中读取数据的一部分字符，保存在【缓冲区数组 c】中
 *     void close()：关闭输入流，并释放与该流相关的任何系统资源
 *
 * 【常规构造方法】：
 *  1、InputStreamReader(InputStream is)
 *
 *  2、InputStreamReader(InputStream is, String charsetName)
 *
 * 【使用步骤】（重点）：
 *  1、创建一个 InputStreamReader 对象，构造方法中传递包含数据源的流对象
 *
 *  2、调用 read 方法从文件中读取数据（同样读到末尾返回 -1）
 *
 *  3、调用 close 方法，释放资源
 *
 * 【注】：指定码表名称要和读取文件的【编码一致】，否则乱码
 * */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr=new InputStreamReader(new FileInputStream(
                "d07_IO//src//D02_IOStreamWR//GBK_W.txt"),"GBK");

        int len=0;
        while ((len=isr.read())!=-1){
            System.out.print((char)len);
        }

        isr.close();

    }
}
