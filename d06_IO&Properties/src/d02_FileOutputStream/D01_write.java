package d02_FileOutputStream;
/*
 * 【java.io.FileOutputStream 类】extends OutputStream：文件字节输出流
 *
 *       - 将内存中的数据写入到硬盘的文件中
 *       - 数据写入原理：java 程序 --> JVM --> OS --> OS 调用写数据方法 --> 数据写入目的地
 *
 * 【常规构造方法】：
 *  1、FileOutputStream(String name)：创建一个向具有【指定名称】的文件中写入数据的文件输出流
 *
 *  2、FileOutputStream(File file)：创建一个向具有【指定 File 对象所表示】的文件中写入数据的文件输出流
 *
 *       - 参数：写入数据的目的地（String name 是一个文件的路径，File file 是一个文件）
 *
 * 【构造方法作用】：
 *  1、创建一个 FileOutputStream 对象
 *
 *  2、根据构造方法传递的路径/文件，创建一个新的空文件
 *
 *  3、把 FileOutputStream 对象指向创建好的文件
 *
 * 【使用步骤】（重点）：
 *  1、创建一个 FileOutputStream 对象，构造方法中传递写入数据的目的地
 *          对象名一般为 fos, xos...
 *
 *  2、调用 FileOutputStream 对象中的 write 方法（已实现父类抽象方法），把数据写入到文件中
 *
 *  3、调用 FileOutputStream 对象中的 close 方法，释放资源（使用流会占用一定内存，用完需清空，提高程序效率）
 *
 * */

import java.io.FileOutputStream;
import java.io.IOException;

public class D01_write {

    public static void main(String[] args) throws IOException {//三步都会编译异常，抛出IO异常(父类)即可

        //1.创建一个 FileOutputStream 对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("d06_IO&Properties//a.txt");

        //2.调用 write，写入数据
        fos.write(97);//a.txt中内容：a

        //3.调用 close，释放资源
        fos.close();
    }

}
