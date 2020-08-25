package d10_FileWriter;
/*
 * 【 flush 与 close 区别】：
 *
 *       - flush：刷新缓冲区，流对象可继续使用
 *
 *       - close：刷新缓冲区，随后告知系统释放资源，流对象不能继续使用
 * */

import java.io.FileWriter;
import java.io.IOException;

public class D02_flush_close {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("d06_IO&Properties//e.txt");

        fw.write(97);

        fw.flush();

        //flush 完，可以继续写入
        fw.write(98);

        fw.close();

        //已关闭流，无法继续写入
        //fw.write(99);//IOException: Stream closed

    }
}
