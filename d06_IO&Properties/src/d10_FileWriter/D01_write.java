package d10_FileWriter;
/*
 * 【【java.io.FileWriter 类】extends OutputStreamWriter】extends Writer：文件字符输出流
 *
 *       - 将内存中的字符数据写入到硬盘的文件中
 *       - 数据写入原理：java 程序 --> JVM --> OS --> OS 调用写入方法 --> 写入目的地
 *
 * 【常规构造方法】：
 *  1、FileWriter(String name)
 *  2、FileWriter(File file)
 *
 *       - 参数：写入目的地（String name 是一个文件的路径，File file 是一个文件）
 *
 * 【使用步骤】（重点）：
 *  1、创建一个 FileWriter 对象，构造方法中传递写入数据的目的地
 *
 *  2、调用 FileWriter 对象中的 write 方法，把数据写入到【内存缓冲区】中【字符 --> 字节】
 *
 * （3、调用 FileWriter 对象中的 flush 方法，【刷新】缓冲区数据至文件中）
 *
 *  4、调用 FileWriter 对象中的 close 方法，释放资源（会先将缓冲区数据刷新至文件中）
 *
 * */

import java.io.FileWriter;
import java.io.IOException;

public class D01_write {

    public static void main(String[] args) throws IOException {

        //1.
        FileWriter fw = new FileWriter("d06_IO&Properties//d.txt");

        //2.
        fw.write(97);

        //3.仅 write 不 flush，数据只在缓冲区，不会被写入
        //fw.flush();可省

        //4.关闭前会先将数据刷新至文件，故3.可省
        fw.close();
    }
}
