package D03_ObjectStream.d02_ObjectInputStream;
/*
 * 【java.io.ObjectInputStream】extends InputStream：对象的反序列化流
 *
 *      - 以（字节输入）流的方式，读取文件中的对象（反序列化对象）
 *
 * （共性方法）：
 *     public abstract int read()：从输出流中读取数据的【下一个字节】
 *     public int read(byte[] b)：从输出流中读取数据的一部分字节，保存在【缓冲区数组 b】中
 *     public void close()：关闭输入流，并释放与该流相关的任何系统资源
 *
 * 【构造方法】：
 *  1、ObjectInputStream(InputStream is)：创建从指定字节输入流读取对象的反序列化流
 *
 * 【特有方法】：
 *  1、Object readObject()：从反序列化流中读取对象
 *
 *      - ClassNotFoundException：当不存在对象的 class 文件时抛出
 *
 *     【反序列化前提】：
 *           1) 类必须实现 Serializable 接口
 *           2) 必须存在类对应的 class 文件
 *
 * 【使用步骤】（重点）：
 *  1、创建 ObjectInputStream 对象，构造方法绑定 FIS 对象（可匿名）
 *
 *  2、调用 ObjectInputStream 的 readObject 方法，读取对象
 *
 *  3、释放资源
 *
 * （4、使用读取到的对象（打印查看））
 * */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "d07_IO//src//D03_ObjectStream//Person.txt"));

        Object obj = ois.readObject();

        //先释放资源
        ois.close();

        //后使用
        System.out.println(obj);
    }
}
