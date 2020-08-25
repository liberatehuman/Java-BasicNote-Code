package d03_File_method;
/*
 * 【 File 类常用方法 -- 2.关于判断的方法】：返回 boolean
 *
 *  1、public boolean exists()：此 File 表示的文件/目录是否实际存在
 *
 *  2、public boolean isDirectory()：此 File 表示的是否为目录
 *
 *  3、public boolean isFile()：此 File 表示的是否为文件
 *
 * 【注】：由于电脑硬盘中要么是文件，要么是文件夹，所以 2、3 两个方法【互斥】；且一般以 1 为【前提】使用
 * */

import java.io.File;

public class D02_exsists_isFile_isDirectory {

    public static void main(String[] args) {

        //exists
        File f1 = new File("//Users//ZHD//Documents//Idea Java projects");
        System.out.println(f1.exists());

        File f2 = new File("//Users//ZHD//Documents//Idea ??? projects");
        System.out.println(f2.exists());

        File f3 = new File("a.docx");
        System.out.println(f3.exists());

        File f4 = new File("???.pdf");
        System.out.println(f4.exists());
        System.out.println("-----------");

        //isDirectory / isFile
        if (f1.exists()) {
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        if (f2.exists()) {//不存在
            System.out.println(f2.isDirectory());//不执行
            System.out.println(f2.isFile());//不执行
        }

        if (f3.exists()) {
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }


    }
}
