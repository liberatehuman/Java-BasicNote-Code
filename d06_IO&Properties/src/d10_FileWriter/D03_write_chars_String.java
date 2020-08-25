package d10_FileWriter;
/*
 * 【字符流写入多个字符】
 *
 *      - void write(char[] c, int off, int len)
 *
 *      - void write(String s)
 *
 *      - void write(String s, int off, int len)
 * */

import java.io.FileWriter;
import java.io.IOException;

public class D03_write_chars_String {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("d06_IO&Properties//f.txt");

        //写入多个字符（字符数组）
        char[] chars = {'A', 'B', 'C', '你', '好'};
        fw.write(chars);

        fw.write(chars, 3, 2);//你好

        //写入字符串
        String s = "我爱你";
        fw.write(s);

        fw.write(s, 1, 2);//爱你

        fw.close();
    }
}
