package D04_PrintStram.d01_PrintStream;
/*
 * 【【java.io.PrintStream 类】extends FilterOutputStream】extends OutputStream
 *
 *       - 只负责数据【输出】，不负责读取
 *
 *       -【永远不会抛出 IOException】
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
 *  1、PrintStream(File file)：输出目的地是一个文件
 *
 *  2、PrintStream(OutputStream os)：输出目的地是一个字节输出流
 *
 *  3、PrintStream(String fileName)：输出目的地是一个路径
 *
 * 【特有方法】：
 *  1、void print(任意类型的值)：打印输出
 *
 *  2、void println(任意类型的值)：打印输出并换行
 *
 * 【注】：
 *  - 使用继承父类的方法 write 写数据：查看数据时会查询码表（97 --> a）
 *  - 使用自己特有的方法 print/println 写数据：原样输出（97 --> 97）
 * */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream("d07_IO//src//D04_PrintStram//a.txt");

        ps.write(97);//a

        ps.println(97);//97
        ps.println(1.5);//1.5
        ps.println('a');
        ps.println("HelloWorld");
        ps.println(true);

        ps.close();
    }
}
