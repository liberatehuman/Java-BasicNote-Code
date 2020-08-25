package d05_Recursion_Ex;
/*
 * 【递归练习 4：查找多级目录下的指定类型文件.txt/.TXT】
 *
 *  基础：遍历多级目录下的所有目录和文件
 *
 * 【分析】：
 *       在遍历多级目录所有内容基础上，增加路径结尾判断，再打印输出
 *
 *  toString/getPath/getName 转为字符串 --> toLowerCase 转小写使大小写不受影响 --> endsWith 判断后缀
 * */

import java.io.File;

public class D04_getxxxFile {

    public static void main(String[] args) {
        File f1 = new File(
                "//Users//ZHD//Documents//Idea Java projects//d05_File&Recursion//aaa");
        getFile(f1);
    }


    public static void getFile(File file) {
        File[] fs = file.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                getFile(f);
            }
            //1.将获取的 File 转换为字符串
            ////String name = f.getName();
            ////String path = f.getPath();
            //String s = f.toString();

            //2.为保证不区分大小写，一律转为小写
            //s = s.toLowerCase();

            //3.根据后缀判断
            //if (s.endsWith(".txt")) {
            //    System.out.println(f.getName());
            //}

            //直接【链式】
            if (f.toString().toLowerCase().endsWith(".txt")) {
                System.out.println(f.getName());
            }
        }
    }
}
