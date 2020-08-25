package D01_Buffered.d03_Buffered_Writer_Reader;
/*
 * 【java.io.BufferedWriter】extends Writer：字符缓冲输出流
 *
 *      利用内部缓冲区（char[]数组），提高底层输出流效率
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
 *  1、BufferedWriter(Writer w)：创建一个新缓冲流，将缓冲数据写入指定底层输出流
 *
 *  2、BufferedWriter(Writer w, int size)：同上，将指定长度缓冲数据写入指定底层输出流
 *  -----------------
 * 【特有方法】：
 *  1、void newLine()：写入一个【行分隔符】（不同OS分隔符不同）
 *
 *      - System.out.println 方法就是调用了 newLine 方法
 *  -----------------
 * 【使用步骤】（重点）：
 * （1、创建 流对象，构造方法绑定写入目的地）
 *
 *  2、创建 BufferedWriter 对象，构造方法绑定 FW 对象（可匿名），提高其效率
 *
 *  3、调用 BufferedWriter 的 write 方法，写入数据到【缓冲区】
 *
 * （4、调用 BufferedWriter 的 flush 方法，刷新数据写入硬盘）
 *
 *  5、释放资源（会先刷新数据写入到硬盘）
 * */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class D01_BufferedWriter {

    public static void main(String[] args) throws IOException {

        //1. 2.
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "d07_IO//src//D01_Buffered//b.txt"));

        //3.
        bw.write("字符缓冲输出流");

        bw.newLine();//写入换行符

        bw.write(new char[]{'a', 'b', 'c'});

        //4.
        //bw.flush();

        //5.
        bw.close();
    }
}
