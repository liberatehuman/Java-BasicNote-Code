package d02_File_Constructor;
/*
 * 【路径 & File 类构造方法】
 *
 * 【路径】：
 *  1、绝对路径：完整路径（以盘符开始的路径）
 *       C:\\...\\xxx.java
 *
 *  2、相对路径：简化路径（相对于当前项目的根目录）
 *       C:\\...\\xxx.java -->简化为 xxx.java
 *
 * 【注】：路径不区分大小写
 *        / 或 \ 是转义符，用两个表示一个
 *
 *  ------------------
 *
 * 【File 类构造方法】：
 *  1、File(String pathname)：将给定路径名字符串转换为抽象路径名，创建一个新的 File 实例
 *
 *       注：路径可以文件/文件夹结尾、绝对/相对路径、实际存在/不存在
 *       （创建 File 对象，只是把字符串路径分装为 File 对象，【不考虑路径真假】）
 *
 *  2、File(String parent, String child)：根据父路径和子路径名，【拼接】创建一个新的 File 实例
 *
 *       - 好处：将路径分为两部分，父子路径可分别单独书写，使用灵活
 *
 *  3、File(File parent, String child)：同上
 *
 *       - 好处：同上 & 父路径为 File 类型，可先对父路径进行 File 方法操作再创建对象
 * */

import java.io.File;

public class Demo {

    public static void main(String[] args) {

        //1.String pathname
        File f1 = new File("//Users//ZHD//Desktop//Java学习路线.jpg");
        System.out.println(f1);//重写了toString方法：/Users/ZHD/Desktop/Java学习路线.jpg

        File f2 = new File("//???//???//???");//不存在的路径也可
        System.out.println(f2);

        //2.String parent, String child
        File f3 = new File("//Users//ZHD//Desktop", "Java学习路线.jpg");//拼接路径
        System.out.println(f3);

        //3.File parent, String child
        File parent = new File("//Users//ZHD//Desktop");
        File f4 = new File(parent, "Java学习路线.jpg");
        System.out.println(f4);
    }
}
