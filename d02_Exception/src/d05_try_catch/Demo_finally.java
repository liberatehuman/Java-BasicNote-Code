package d05_try_catch;
/*
 *【finally 代码块】
 *
 *【格式】：
 *       try {
 *           ...
 *       } catch (异常类名 变量名) {
 *           ...
 *       } finally {
 *           无论是否出现异常，必定执行的代码
 *       }
 *
 *【注】：
 * 1、finally 必须和【try】一起使用
 *
 * 2、finally 一般用于【资源释放/回收】，无论是否出现异常，最后都要资源释放（ IO 流常用）
 *
 * */

import java.io.IOException;

public class Demo_finally {

    public static void main(String[] args) {

        try {
            readFile("C:/a.doc");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally - 资源释放");//必定执行
        }

    }

    public static void readFile(String path) throws IOException {
        if (!path.endsWith(".txt")) {
            throw new IOException("传递的文件类型不对");
        }
        System.out.println("传递的文件OK");
    }

}
