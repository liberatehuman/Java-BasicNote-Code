package d02_FileOutputStream;
/*
 * 【一次写入多个字节】
 *
 *  1、若写入的第一个字节是【正数】（0-127），那么会根据 ASCII 显示
 *
 *  2、若写入的第一个字节是【负数】，则第一和第二个字节组成一个【中文】显示，查询系统默认编码表（GBK）
 * */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class D02_write_bytes {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("d06_IO&Properties//b.txt");

        //写入多个字节（正数）
        byte[] bytes1 = {65, 66, 67, 68};//ABCD
        fos.write(bytes1);

        //写入多个字节（负数），二合一中文
        byte[] bytes2 = {-65, -66, -67, 68};//烤侥
        fos.write(bytes2);

        //从 off 开始挑选 len 个字节写入
        fos.write(bytes1, 1, 2);//BC

        //直接：字符串 --> 字节数组
        byte[] bytes3 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes3));//[-28, -67, -96, -27, -91, -67]
        fos.write(bytes3);//打不开？？？

        fos.close();
    }
}
