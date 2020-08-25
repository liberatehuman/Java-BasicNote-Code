package d08_FileReader;
/*
 * 【【java.io.FileReader 类】extends InputStreamReader】extends Reader：文件字符输入流
 *
 *       - 从硬盘的文件中读取字符到内存中
 *       - 读取数据原理：java 程序 --> JVM --> OS --> OS 调用读取方法 --> 读取字符数据
 *
 * 【常规构造方法】：
 *  1、FileReader(String name)
 *
 *  2、FileReader(File file)
 *
 * 【使用步骤】（重点）：
 *  1、创建一个 FileReader 对象，构造方法中传递要读取的数据源
 *
 *  2、调用 read 方法从文件中读取数据（同样读到末尾返回 -1）
 *
 *          int read()：从输出流中读取数据的【下一个字符】
 *          - 返回值 int：【字符内容】
 *
 *  3、调用 close 方法，释放资源
 * */

import java.io.FileReader;
import java.io.IOException;

public class D01_read {

    public static void main(String[] args) throws IOException {

        //1.
        FileReader fr = new FileReader("d06_IO&Properties//c.txt");

        //2.
        int len = 0;

        //单个字符读取
//        while ((len=fr.read())!=-1){
//            System.out.println((char) len);
//        }

        //多个字符读取
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        //3.
        fr.close();
    }
}
