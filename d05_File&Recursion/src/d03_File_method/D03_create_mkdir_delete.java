package d03_File_method;
/*
 * 【 File 类常用方法 -- 3.创建/删除的方法】：返回 boolean
 *
 *  1、public boolean createNewFile()：创建一个空文件，未存在的返回 true，反之 false
 *
 *       - 绝对路径/相对路径皆可；
 *
 *       - 文件名不会改变其类型是【文件】；
 *
 *       - 不存在的路径抛异常IOException
 *
 *  2、public boolean mkdir()：创建此 File 表示的单级目录
 *
 *  3、public boolean mkdirs()：创建此 File 表示的多级目录
 *
 *  4、public boolean delete()：（在硬盘上）删除此 File 表示的文件/目录
 *
 *       - 若路径不存在/目录下有内容，不会删除，返回 false
 *
 *       - 一旦删除，就是从硬盘中删除，无法从回收站复原，【慎用】
 *
 * */

import java.io.File;
import java.io.IOException;

public class D03_create_mkdir_delete {

    public static void main(String[] args) throws IOException {

        //createNewFile
        File f1 = new File(
                "//Users//ZHD//Documents//Idea Java projects//d05_File&Recursion//1.txt");
        boolean b1 = f1.createNewFile();//绝对路径
        System.out.println(b1);

        File f2 = new File("d05_File&Recursion//2.txt");
        System.out.println(f2.createNewFile());//相对路径

        File f3 = new File("d05_File&Recursion//新建文件夹");
        System.out.println(f3.createNewFile());//true，以【文件】类型为准，不被名称迷惑

        File f4 = new File("d05_???//4.txt");
        //System.out.println(f4.createNewFile());//IOException，路径不存在
        System.out.println("-------");

        //mkdir / mkdirs
        File f5 = new File("d05_File&Recursion//111");
        boolean b2 = f5.mkdir();
        System.out.println(b2);

        File f6 = new File("d05_File&Recursion//a.txt");
        System.out.println(f6.mkdir());//创建【文件夹】操作，不被名称迷惑

        File f7 = new File("???//?.txt");
        System.out.println(f7.mkdir());//false，不存在

        File f8 = new File("d05_File&Recursion//aaa//bbb//ccc//ddd");
        System.out.println(f8.mkdirs());

        File f9 = new File("???//?.txt");
        System.out.println(f9.mkdirs());//true，不存在的路径创建多级目录却可以？
        System.out.println("-------");

        //delete
        boolean b3 = f9.delete();
        System.out.println(b3);

        File f10 = new File("d05_File&Recursion//aaa");
        f10.mkdir();
        File f11 = new File("d05_File&Recursion//aaa//3.txt");
        f11.createNewFile();
        System.out.println(f10.delete());//文件夹里有内容，不会删，返回false

    }
}
