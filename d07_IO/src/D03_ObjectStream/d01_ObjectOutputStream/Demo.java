package D03_ObjectStream.d01_ObjectOutputStream;
/*
 * 【java.io.ObjectOutputStream 类】extends OutputStream：对象的序列化流
 *
 *      - 把对象以（字节输出）流的方式，写入到文件保存（序列化对象）
 *
 * （共性方法）：
 *     public abstract void write(int b)：将指定的字节写入输出流
 *     public void write(byte[] b)：将 b.length 字节从指定字节数组写入此输出流
 *     public void write(byte[] b, int off, int len)：从指定数组偏移量 off 开始写入 len 字节到输出流
 *     public void close()：关闭输出流，并释放与该流相关的任何系统资源
 *     public void flush()：刷新输出流，并强制输出任何缓存的输出字节
 *
 * 【构造方法】：
 *  1、ObjectOutputStream(OutputStream os)：创建写入指定字节输出流的序列化流
 *
 * 【特有方法】：
 *  1、void writeObject(Object obj)：将指定对象写入序列化流（对象必须有 Serializable 标记）
 *
 * 【使用步骤】（重点）：
 *  1、创建 ObjectOutputStream 对象，构造方法绑定 FOS 对象（可匿名）
 *
 *  2、调用 ObjectOutputStream 的 writeObject 方法，把对象写入文件
 *
 * （* 调用 ObjectOutputStream 的 flush 方法，刷新数据写入硬盘）
 *
 *  3、释放资源（会先刷新数据写入到硬盘）
 * */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "d07_IO//src//D03_ObjectStream//Person.txt"));

        oos.writeObject(new Person("小明", 18));

        oos.close();
    }
}
