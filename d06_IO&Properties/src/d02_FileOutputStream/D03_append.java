package d02_FileOutputStream;
/*
* 【续写&换行】
*
* 【专用构造方法】：
*  1、FileOutputStream(String name, boolean append)
*
*  2、FileOutputStream(File file, boolean append)
*
*       - 在常规构造方法上，加了【追加写开关】append：
*
*       true：创建对象，【不覆盖】原文件续写
*
*       false：创建一个新文件，【覆盖】原文件重新写
* */
import java.io.FileOutputStream;
import java.io.IOException;

public class D03_append {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(
                "d06_IO&Properties//c.txt",
                true);//允许续写

        fos.write("你好".getBytes());
        fos.write("\r".getBytes());//换行符

        fos.close();
    }
}
