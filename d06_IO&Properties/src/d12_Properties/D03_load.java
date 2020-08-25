package d12_Properties;
/*
 * 【与流相关方法2：load 】：
 *
 *       加载硬盘中保存的数据（键值对）到集合中
 *
 *  1、void load(InputStream is)：用字节输入流读取硬盘数据
 *
 *  2、void load(Reader r)：用字符输入流读取硬盘数据
 *
 *       - InputStream is：字节输入流（不可中文）
 *
 *       - Reader r：字符输入流（可中文）
 *
 * 【使用步骤】：
 *  1、创建 Properties 对象，并添加数据
 *
 *  2、创建 字节输出流/字符输出流 对象，构造方法传递写入目的地
 *
 *  3、调用 Properties 的 load 方法，加载硬盘中保存的数据到集合中
 *
 *  4、遍历 key 集合（先调用 stringPropertyNames 方法获取集合的 keys）
 * */

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class D03_load {

    public static void main(String[] args) throws IOException {

        //1.创建 Properties 对象
        Properties p = new Properties();

        //2.创建流对象
        FileInputStream fis = new FileInputStream("d06_IO&Properties//Property_1.txt");
        FileReader fr = new FileReader("d06_IO&Properties//Property_1.txt");

        //3.调用 Properties 的 load 方法，将集合中的临时数据持久化写入硬盘
        p.load(fis);//用字节输入流读取（中文乱码）
        p.load(fr);//用字符输入流读取（中文正常）

        //4.遍历 key 集合
        Set<String> set = p.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "=" + p.getProperty(key));
        }

    }
}
