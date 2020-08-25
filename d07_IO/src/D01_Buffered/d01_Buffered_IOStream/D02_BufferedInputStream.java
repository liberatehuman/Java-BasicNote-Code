package D01_Buffered.d01_Buffered_IOStream;
/*
 * 【java.io.BufferedInputStream】extends InputStream：字节缓冲输出流
 *
 * （共性方法）：
 *     public abstract int read()：从输出流中读取数据的【下一个字节】
 *     public int read(byte[] b)：从输出流中读取数据的一部分字节，保存在【缓冲区数组 b】中
 *     public void close()：关闭输入流，并释放与该流相关的任何系统资源
 *
 * 【构造方法】：
 *  1、BufferedInputStream(InputStream is)：创建一个新缓冲流，将缓冲数据写入指定底层输入流
 *
 *  2、BufferedInputStream(InputStream is, int size)：同上，将指定长度缓冲数据写入指定底层输入流
 *
 * 【使用步骤】（重点）：
 * （1、创建 FIS 对象，构造方法绑定输出目的地）
 *
 *  2、创建 BufferedInputStream 对象，构造方法绑定 FIS 对象（可匿名），提高其效率
 *
 *  3、调用 BufferedInputStream 的 read 方法，读取数据
 *
 *  4、释放资源
 * */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class D02_BufferedInputStream {

    public static void main(String[] args) throws IOException {

        //1.
        FileInputStream fis = new FileInputStream("d07_IO//src//D01_Buffered//a.txt");

        //2/
        BufferedInputStream bis = new BufferedInputStream(fis);

        //3.
        int len = 0;
        //单个字节读取
//        while ((len=bis.read())!=-1){
//            System.out.println(len);
//        }
        //多个字节读取
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //4.
        bis.close();
    }
}
