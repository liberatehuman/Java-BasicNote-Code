package d05_EX_copyFile;
/*
 * 【字节流练习：复制文件】：读 + 写
 *
 * 【明确】：数据源 & 目的地
 *
 * 【步骤】：
 *  1、创建一个字节输入流对象，构造方法传递要读取的数据源
 *  2、创建一个字节输出流对象，构造方法传递要写入的目的地
 *  3、使用输入流的 read 方法，读取数据
 *  4、使用输出流的 write 方法，写入数据
 *  5、关闭输出流（写），再关输出（读）（写完一定读完了）
 * */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        long t0 = System.currentTimeMillis();

        //数据源
        FileInputStream fis = new FileInputStream("d06_IO&Properties//a.txt");
        //目的地
        FileOutputStream fos = new FileOutputStream("d06_IO&Properties//a_1.txt");

        int len = 0;

        //单个字节复制（5ms）
//        while ((len=fis.read())!=-1){
//            fos.write(len);
//        }

        //所有字节复制（3ms）
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        //先关写，后关读
        fos.close();
        fis.close();


        long t = System.currentTimeMillis();
        System.out.println("耗时：" + (t - t0) + "ms");
    }
}
