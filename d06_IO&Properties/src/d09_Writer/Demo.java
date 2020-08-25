package d09_Writer;
/*
 * 【java.io.Writer 抽象类】：此抽象类表示【字符输出流】所有类的超类
 *
 * 【共性方法】：
 *  1、void write(int b)：将指定单个字符写入输出流
 *
 *  2、void write(char[] c)：将 b.length 字符从指定数组写入此输出流
 *
 *  3、abstract void write(char[] c, int off, int len)：从指定数组偏移量 off 开始写入 len 字符到输出流
 *
 *  4、void write(String s)：写入指定字符串至此输出流
 *
 *  5、void write(String s, int off, int len)：从偏移量 off 开始写入 len 长度字符串到输出流
 *
 *  6、void flush()：刷新缓冲区输，并强制输出任何缓存的输出字符
 *
 *  7、void close()：关闭输出流，并释放与该流相关的任何系统资源
 * */

public class Demo {
}
