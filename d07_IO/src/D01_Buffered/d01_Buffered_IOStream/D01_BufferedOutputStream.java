package D01_Buffered.d01_Buffered_IOStream;
/*
 * 【java.io.BufferedOutputStream】extends OutputStream：字节缓冲输出流
 *
 *      利用内部缓冲区（byte[]数组），提高底层输出流效率
 *
 * （共性方法）：
 *     public abstract void write(int b)：将指定的字节写入输出流
 *     public void write(byte[] b)：将 b.length 字节从指定字节数组写入此输出流
 *     public void write(byte[] b, int off, int len)：从指定数组偏移量 off 开始写入 len 字节到输出流
 *     public void close()：关闭输出流，并释放与该流相关的任何系统资源
 *     public void flush()：刷新输出流，并强制输出任何缓存的输出字节
 *
 * 【构造方法】给底层流添加缓冲区：
 *  1、BufferedOutputStream(OutputStream os)：创建一个新缓冲流，将缓冲数据写入指定底层输出流
 *
 *  2、BufferedOutputStream(OutputStream os, int size)：同上，将指定长度缓冲数据写入指定底层输出流
 *
 * 【使用步骤】（重点）：
 * （1、创建 FOS 对象，构造方法绑定写入目的地）
 *
 *  2、创建 BufferedOutputStream 对象，构造方法绑定 FOS 对象（可匿名），提高其效率
 *
 *  3、调用 BufferedOutputStream 的 write 方法，写入数据到【缓冲区】
 *
 * （4、调用 BufferedOutputStream 的 flush 方法，刷新数据写入硬盘）
 *
 *  5、释放资源（会先刷新数据写入到硬盘）
 * */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D01_BufferedOutputStream {

    public static void main(String[] args) throws IOException {

        //1.创建 FOS 对象
        FileOutputStream fos = new FileOutputStream("d07_IO//src//D01_Buffered//a.txt");

        //2.创建 BufferedOutputStream 对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3.调用 BufferedOutputStream 的 write
        bos.write("数据写入字节缓冲区".getBytes());

        //（4.）
        //bos.flush();

        //5.释放资源
        bos.close();
    }
}
