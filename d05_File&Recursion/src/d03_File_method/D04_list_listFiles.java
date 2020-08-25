package d03_File_method;
/*
 * 【 File 类常用方法 -- 4.遍历目录的方法】
 *
 *  1、public String[] list()：返回该 File 目录中所有的【一级】子文件/目录的一个 String 数组
 *
 *  2、public File[] listFiles()：返回该 File 目录中所有的【一级】子文件/目录的一个 File 数组
 *
 * 【注】：
 *  1、两个方法遍历的都是 File 构造方法里的目录
 *
 *  2、若目录路径不存在，或是文件路径，则抛异常：NullPointerException
 *
 *  3、【隐藏】的文件/文件夹也会被遍历
 *
 *  */

import java.io.File;

public class D04_list_listFiles {

    public static void main(String[] args) {

        // list
        File f1 = new File(
                "//Users//ZHD//Documents//Idea Java projects//d05_File&Recursion");
        //File f1 = new File("...//d05_File&Recursion//1.txt");//抛异常：NullPointerException

        String[] s = f1.list();
        for (String dir : s) {
            System.out.println(dir);
            //.DS_Store(Desktop Services Store)，隐藏文件，存贮目录的自定义属性
            // 如文件的图标位置或背景色。相当于 Windows 下的 desktop.ini
        }

        // listFiles
        File f2 = new File(
                "//Users//ZHD//Documents//Idea Java projects//d05_File&Recursion");

        File[] files = f2.listFiles();
        for (File f : files) {
            System.out.println(f);//打印 File 类型，调用的是 toString 方法，
        }

    }
}
