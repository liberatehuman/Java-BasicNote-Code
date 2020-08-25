package d03_File_method;
/*
* 【 File 类常用方法 -- 1.关于获取的方法】
*
*  1、public String getAbsolutePath()：返回此 File 对象的绝对路径名字符串
*
*  2、public String getPath()：返回此 File 对象的路径名字符串（当前根目录？？？）
*
*      - File 类中的 toString() 方法实际上就是调用 getPath
*
*  3、public String getName()：返回此 File 表示的文件/目录名称，即路径结尾
*
*  4、public long length()：返回此 File 表示的文件大小，以字节表示
*
 *     - 对于文件夹和不存在的文件，返回【0】（mac下文件夹返回不为0 ？？？）
*
* */
import java.io.File;

public class D01_getAbsolutePath_getName_length {

    public static void main(String[] args) {

        File f1 = new File("//Users//ZHD//Desktop//Java学习路线.jpg");
        File f2 = new File("Java学习路线.jpg");

        //getAbsolutePath
        String s1=f1.getAbsolutePath();
        System.out.println(s1);
        System.out.println(f2.getAbsolutePath());//相对路径
        System.out.println("--------------------------------------");

        //getPath
        String s2=f1.getPath();
        System.out.println(s2);
        System.out.println(f2.getPath());

        System.out.println(f2.toString());//同上，toString 方法实际上就是调用 getPath
        System.out.println("--------------------------------------");

        //getName
        String s3=f1.getName();
        System.out.println(s3);
        System.out.println(f2.getName());
        System.out.println("--------------------------------------");

        //length
        long l1=f1.length();
        System.out.println(l1);

        File f3 = new File("//Users//ZHD//Desktop//?.jpg");//不存在的文件
        System.out.println(f3.length());//0

        File f4 = new File("//Users//ZHD//Desktop//BCI");//结尾是文件夹
        System.out.println(f4.length());//384；文件夹应该也是0 ？？？

    }
}
