package D02_IOStreamWR.d04_EX_convertfile;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr=new InputStreamReader(new FileInputStream(
                "d07_IO//src//D02_IOStreamWR//GBK_W.txt"),"GBK");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(
                "d07_IO//src//D02_IOStreamWR//GBK_to_UTF-8.txt"),"UTF-8");

        int len=0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }

        osw.close();
        isr.close();
    }
}
