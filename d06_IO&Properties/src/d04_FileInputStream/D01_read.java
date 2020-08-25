package d04_FileInputStream;
/*
 * 【java.io.FileInputStream 类】extends InputStream：文件字节输入流
 *
 *       - 从硬盘的文件中读取字节到内存中
 *       - 读取数据原理：java 程序 --> JVM --> OS --> OS 调用读取方法 --> 读取字节数据
 *
 * 【常规构造方法】：
 *  1、FileInputStream(String name)
 *
 *  2、FileInputStream(File file)
 *
 * 【使用步骤】（重点）：
 *  1、创建一个 FileInputStream 对象，构造方法中传递要读取数据的数据源
 *
 *  2、调用 read 方法从文件中读取数据（调用一次就会读取下一个字节；读到末尾返回 -1）
 *
 *          int read()：从输出流中读取数据的【下一个字节】
 *          - 返回值 int：【字节内容】
 *
 *  3、调用 close 方法，释放资源
 * */

import java.io.FileInputStream;
import java.io.IOException;

public class D01_read {

    public static void main(String[] args) throws IOException {

        //1.创建一个 FileInputStream 对象
        FileInputStream fis = new FileInputStream("d06_IO&Properties//a.txt");

        //2.read 读取数据
//        System.out.println(fis.read());//97(a)
//        System.out.println(fis.read());//98(b)
//        System.out.println(fis.read());//99(c)
//
//        System.out.println(fis.read());//-1
//        System.out.println(fis.read());//-1

        //重复代码使用循环，终止条件：读取到-1

        // ↓ 不可行，因为【每调用一次read，就会读取下一个字节】
//        while (fis.read() != -1) {//调用第1次，97（调用第3次，99）
//            System.out.println(fis.read());//调用第2次，98（调用第4次，-1）--> 打印：98 -1
//        }

        //将每次读取到的字节保存到一个变量中，循环一次只需读取一次
        int len = 0;
        while ((len = fis.read()) != -1) {
            //System.out.println(data);//read 返回的就是字节内容
            System.out.println((char) len);//可以转为字符查看
        }

        //3.释放资源
        fis.close();


    }
}
