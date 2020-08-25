package d06_problem_fis_Chinese;
/*
 * 【字节流读取中文的问题】
 *
 *  1 个中文字：
 *
 *       UTF-8：占 3 个字节
 *       GBK：占 2 个字节
 * */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("d06_IO&Properties//c.txt");

        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println(len);//228 189 160（你）229 165 189（好）
            //System.out.println((char)d);//乱码，因为一次只能读一个字节（一个字的1/3）
        }

        fis.close();
    }
}
