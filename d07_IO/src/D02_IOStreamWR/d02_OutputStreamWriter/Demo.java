package D02_IOStreamWR.d02_OutputStreamWriter;
/*
 * 【java.io.OutputStreamWriter 类】extends Writer：字符流转换为字节流
 *
 *       - 用指定 charset 将字符转换成字节（编码过程）
 *
 * （共性方法）：
 *     void write(int b)：将指定单个字符写入输出流
 *     void write(char[] c)：将 b.length 字符从指定数组写入此输出流
 *     abstract void write(char[] c, int off, int len)：从指定数组偏移量 off 开始写入 len 字符到输出流
 *     void write(String s)：写入指定字符串至此输出流
 *     void write(String s, int off, int len)：从偏移量 off 开始写入 len 长度字符串到输出流
 *     void flush()：刷新缓冲区输，并强制输出任何缓存的输出字符
 *     void close()：关闭输出流，并释放与该流相关的任何系统资源
 *
 * 【构造方法】：
 *  1、OutputStreamWriter(OutputStream os)
 *
 *  2、OutputStreamWriter(OutputStream os, String charsetName)
 *
 *       - String charsetName：指定的编码表名称（不区分大小写；不指定默认为 UTF-8）
 *
 * 【使用步骤】（重点）：
 *  1、创建一个 OutputStreamWriter 对象，构造方法中传递包含写入目的地的流对象（可匿名）
 *
 *  2、调用 OutputStreamWriter 对象中的 write 方法，把【字符-->字节】（编码）写入到内存缓冲区中
 *
 * （3、调用 OutputStreamWriter 对象中的 flush 方法，刷新缓冲区数据至文件中）
 *
 *  4、调用 OutputStreamWriter 对象中的 close 方法，释放资源
 *
 * */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo {

    public static void main(String[] args) throws IOException {

        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(
                "d07_IO//src//D02_IOStreamWR//GBK_W.txt"),"GBK");

        osw.write("你好");

        osw.close();
    }
}
