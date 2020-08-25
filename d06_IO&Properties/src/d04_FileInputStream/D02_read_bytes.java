package d04_FileInputStream;
/*
 * 【一次读取多个字节】
 *
 *      public int read(byte[] b)
 *
 *      - 参数 byte[]：【缓冲区】数组，保存每次读取的字节
 *          （一般定义为1024字节=1kb，或其整数倍，保证读取完整）
 *
 *      - 返回值 int：每次读取的有效【字节个数】
 *
 *  ------------------
 * 【String 类的构造方法】：进行打印处理
 *  1、String(byte[] bytes)：创建一个 String 对象，内容是由数组转为的字符串
 *
 *  2、String(byte[] bytes, int offset, int len)：同上，从数组的 offset 开始的 len 个字节转为字符串
 * */

import java.io.FileInputStream;
import java.io.IOException;

public class D02_read_bytes {

    public static void main(String[] args) throws IOException {

        //1.
        FileInputStream fis = new FileInputStream("d06_IO&Properties//b.txt");

        //2.
//        byte[] bytes1=new byte[2];
//        System.out.println(fis.read(bytes1));//2
//        System.out.println(new String(bytes1));//AB
//
//        System.out.println(fis.read(bytes1));//2
//        System.out.println(new String(bytes1));//CD
//
//        System.out.println(fis.read(bytes1));//1
//        System.out.println(new String(bytes1));//ED，只有1个有效字节E，但D仍在缓冲区第二位，同样打印出
//
//        System.out.println(fis.read(bytes1));//-1
//        System.out.println(new String(bytes1));//ED，无有效字节，ED仍在缓冲区

        byte[] bytes = new byte[1024];//大容量缓冲区
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(len);//5
            System.out.println(new String(bytes, 0, len));//ABCDE
        }

        //3.
        fis.close();
    }
}
