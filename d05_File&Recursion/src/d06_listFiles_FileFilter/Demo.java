package d06_listFiles_FileFilter;
/*
 * 【File 过滤器】：查找的指定类型文件方法
 *
 *       - File 类中有 2 个与【listFiles 重载】的方法，其【参数传递的就是过滤器】
 *
 *       - 2 个过滤器接口都【没有实现类】，需要自己写实现类，并重写 accept 方法定义过滤规则
 *  -----------------------
 * 【File 过滤器 1：FileFilter 】
 *
 *       File[] listFiles(FileFilter filter)
 *
 * 【java.io.FileFilter 接口】：用于抽象路径名（即 File 对象）的过滤器
 *
 *       - 抽象方法：boolean accept(File pathname);
 *
 *       - 作用：过滤文件，即【File 对象】
 * */

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        File f1 = new File("d05_File&Recursion//aaa");
        getFile(f1);
    }


    public static void getFile(File file) {

        //1.先过滤
        //File[] fs = file.listFiles(new FileFilterImpl());// listFiles 会调用过滤器的 accept 方法

        // ↓ 优化：匿名内部类
        //File[] fs = file.listFiles(new FileFilter() {
        //      @Override
        //      public boolean accept(File pathname) {
        //          return pathname.isDirectory()||pathname.toString().toLowerCase().endsWith(".txt"));
        //      }
        //});

        // ↓ 进一步优化：Lambda
        File[] fs = file.listFiles((pathName) ->
                pathName.isDirectory() || pathName.toString().toLowerCase().endsWith(".txt"));

        //2.遍历递归
        for (File f : fs) {
            if (f.isDirectory()) {
                getFile(f);
            } else {//【加 else】，否则目录会也被打印（不影响递归遍历）
                System.out.println(f.getName());
            }
        }

    }

}