package d06_listFiles_FilenameFilter;

/*
 * 【File 过滤器 2：FilenameFilter 】
 *
 *       File[] listFiles(FilenameFilter filter)
 *
 * 【java.io.FilenameFilter 接口】：文件名称的过滤器
 *
 *       - 抽象方法：boolean accept(File dir, String name);
 *          //dir 是目录名称，name 是每个文件名称（调用 listFiles 的抽象路径下的一级内容）
 *
 *       - 作用：过滤【文件名称】
 * */

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        File f1 = new File("d05_File&Recursion//aaa");
        get(f1);
    }


    public static void get(File file) {

        //File[] fs = file.listFiles(new FilenameFilter() {
        //      @Override
        //      public boolean accept(File dir, String name) {
        //          return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".txt"));
        //      }
        //});

        File[] fs = file.listFiles((dir, name) ->
                new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".txt"));
        //父路径 dir，子路径 name，【封装】成一个 new File
        //若只是 dir.isDirectory，【.DS_store】不是目录也会被打印出

        for (File f : fs) {
            if (f.isDirectory()) {
                get(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
