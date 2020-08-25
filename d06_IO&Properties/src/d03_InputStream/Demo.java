package d03_InputStream;

/*
 * 【java.io.InputStream 抽象类】：此抽象类表示【字节输入流】所有类的超类
 *
 * 【共性方法】：
 *  1、public abstract int read()：从输出流中读取数据的【下一个字节】
 *
 *  2、public int read(byte[] b)：从输出流中读取数据的一部分字节，保存在【缓冲区数组 b】中
 *
 *  3、public void close()：关闭输入流，并释放与该流相关的任何系统资源
 *
 * 【注】：1、2的返回值都是 int，但意义不同：
 *
 *      - 1 中：返回【字节内容】
 *
 *      - 2 中：返回【字节个数】（读取内容暂存在缓冲区 byte[] 中）
 * */

public class Demo {
}
