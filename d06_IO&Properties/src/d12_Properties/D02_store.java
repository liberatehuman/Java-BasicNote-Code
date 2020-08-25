package d12_Properties;
/*
 * 【与流相关方法1：store 】：
 *
 *       将集合中的临时数据，【持久化】写入硬盘中
 *
 *  1、void store(OutputStream os, String comments)：用字节输出流将临时数据写入硬盘
 *
 *  2、void store(Writer w, String comments)：用字符输出流将临时数据写入硬盘
 *
 *       - OutputStream os：字节输出流（不可中文）
 *
 *       - Writer w：字符输出流（可中文）
 *
 *       - String comments：注释（默认 Unicode 编码【不可中文】），一般用空字符串""
 *
 * 【使用步骤】：
 *  1、创建 Properties 对象，并添加数据
 *
 *  2、创建 字节输出流/字符输出流 对象，构造方法传递写入目的地
 *
 *  3、调用 Properties 的 store 方法，将集合中的临时数据持久化写入硬盘
 *
 *  4、释放资源
 * */

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class D02_store {

    public static void main(String[] args) throws IOException {

        //1.创建 Properties 对象并添加数据
        Properties p = new Properties();
        p.setProperty("迪丽热巴", "27");
        p.setProperty("古力娜扎", "25");
        p.setProperty("马尔扎哈", "99");

        //2.创建流对象，构造方法传递写入目的地
        FileOutputStream fos = new FileOutputStream("d06_IO&Properties//Property.txt");

        FileWriter fw = new FileWriter("d06_IO&Properties//Property_1.txt");

        //3.调用 Properties 的 store 方法
        p.store(fos, "save byte data");//throws 编译异常 IOException

        p.store(fw, "save char data");

        //4.释放资源
        fos.close();

        fw.close();
    }
}
