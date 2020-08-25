package d05_Recursion_Ex;
/*
 * 【递归练习 3：遍历多级目录下的所有目录和文件】
 *
 *  基础：遍历目录
 *
 *       利用 foreach 遍历 File.listFiles 返回的 File类数组，getName 打印路径结尾
 *
 *       【缺点】：只能遍历【一级目录】下的子目录和文件
 * -------------
 * 【分析】：
 *       在普通遍历目录基础上，遍历到一个 File[] 元素时，用 isDirectory 判断
 *
 *       --> 若仍是目录，【递归】，继续变量该子目录...
 *       */

import java.io.File;

public class D03_getAllFiles {

    public static void main(String[] args) {

        File f1 = new File(
                "//Users//ZHD//Documents//Idea Java projects//d05_File&Recursion//aaa");

        get(f1);//仅一级子目录和文件
        System.out.println("----------");
        getAllFiles(f1);

    }


    public static void getAllFiles(File file) {
        File[] fs = file.listFiles();
        for (File f : fs) {
            //该元素是目录
            if (f.isDirectory()) {
                getAllFiles(f);//【递归】遍历该【子目录】
            }
            //这里【不加 else】不影响递归遍历（若为目录，至少会打印，否则只打印非目录的文件）
            System.out.println(f.getName());
        }
    }

    //普通遍历 File 目录（仅一级）
    public static void get(File file) {
        File[] fs = file.listFiles();
        for (File f : fs) {
            System.out.println(f.getName());
        }
    }
}
