package D01_Buffered.d03_Buffered_Writer_Reader;
/*
 * 【java.io.BufferedReader】extends Reader：字符缓冲输入流
 *
 * （共性方法）：
 *     int read()：从输入流中读取数据的【下一个字节】
 *     int read(char[] c)：从输入流中读取数据的一部分字符，保存在【缓冲区数组 c】中
 *     void close()：关闭输入流，并释放与该流相关的任何系统资源
 *
 * 【构造方法】：
 *  1、BufferedReader(Reader r)：创建一个新缓冲流，将缓冲数据写入指定底层输入流
 *
 *  2、BufferedReader(Reader r, int size)：同上，将指定长度缓冲数据写入指定底层输入流
 *  -----------------
 * 【特有方法】：
 *  1、String readLine()：读取一个文本行（读一行）
 *
 *      - 执行一次，读取到换行符(\n)/回车(\r)/回车紧跟换行(\r\n)终止
 *
 *      - 返回值：包含该行内容的字符串，不包含终止符，若已到末尾，返回【null】
 *  -----------------
 * 【使用步骤】（重点）：
 * （1、创建 FR 对象，构造方法绑定输出目的地）
 *
 *  2、创建 BufferedReader 对象，构造方法绑定 FR 对象（可匿名），提高其效率
 *
 *  3、调用 BufferedReader 的 read/readLine 方法，读取数据
 *
 *  4、释放资源
 * */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D02_BufferedReader {

    public static void main(String[] args) throws IOException {

        //1. 2.
        BufferedReader br = new BufferedReader(new FileReader(
                "d07_IO//src//D01_Buffered//b.txt"));

        //3.
        //一行一行读
        //String line=br.readLine();
        //System.out.println(line);//字符缓冲输出流

        //System.out.println(br.readLine());//abc

        //System.out.println(br.readLine());//【null】

        //读所有行
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //4.
        br.close();
    }
}
