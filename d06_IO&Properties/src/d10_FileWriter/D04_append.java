package d10_FileWriter;
/*
 * 【字符流 - 续写 & 换行】（同字节流）
 * */

import java.io.FileWriter;
import java.io.IOException;

public class D04_append {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("d06_IO&Properties//g.txt", true);

        fw.write("Hello\r");

        fw.close();
    }
}
