package d01_File;
/*
 * 【java.io.File 类】：文件和目录路径名的抽象表现形式，File 对象又称【抽象路径名】
 *
 *       - Java 将【文件和文件夹（目录）封装为一个 File 类】，通过其对文件或文件夹进行操作
 *
 *  可使用的方法：
 *       创建 文件/文件夹
 *       删除 文件/文件夹
 *       获取 文件/文件夹
 *       判断 文件/文件夹是否存在
 *       遍历 文件夹
 *       获取 文件的大小
 *
 * 【注】：File 类是与【操作系统无关】的类，任何OS都可使用类中的方法
 *
 * 【重点】：【File - 文件】【directory - 文件夹/目录】【path - 路径】
 *
 * 【方法】：
 *  1、static String pathSeparator：与系统有关的路径分隔符（字符串）
 *  2、static Char pathSeparatorChar：与系统有关的路径分隔符（字符）
 *
 *  3、static String Separator：与系统有关的默认名称分隔符（字符串）
 *  4、static Char SeparatorChar：与系统有关的默认名称分隔符（字符）
 *
 *       - 路径一般不写死：
 *           Windows：C:\...\xxx.java
 *           Linux：C:/.../xxx.java
 *          （ 建议："C:" + File.separator + "..." + File.separator + "xxx.java" ）
 * */

import java.io.File;

public class Demo {

    public static void main(String[] args) {

        String ps = File.pathSeparator;
        System.out.println(ps);//":"

        char psc = File.pathSeparatorChar;
        System.out.println(psc);//":"

        String s = File.separator;
        System.out.println(s);//"/"

        char sc = File.separatorChar;
        System.out.println(sc);//"/"


    }
}
