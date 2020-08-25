package D02_IOStreamWR.d01_Reader_GBK;
/*
 * 【字符流读 GBK 文件问题】
 *
 *  文件编码：GBK
 *  IDEA 编码：UTF-8
 *
 *  编码规则不同，读取会乱码
 * */

import java.io.FileReader;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(
                "d07_IO//src//D02_IOStreamWR//GBK.txt");//IDEA下方可选编码

        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);//���乱码
        }

        fr.close();
    }
}
