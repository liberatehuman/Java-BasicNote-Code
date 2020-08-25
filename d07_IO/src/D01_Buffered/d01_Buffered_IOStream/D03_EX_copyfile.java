package D01_Buffered.d01_Buffered_IOStream;
/*【字节流复制文件（前）】*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D03_EX_copyfile {

    public static void main(String[] args) throws IOException {

        long t0 = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("d07_IO//src//D01_Buffered//1.jpg");
        FileOutputStream fos = new FileOutputStream("d07_IO//src//D01_Buffered//1_copy.jpg");

        int len = 0;

        //单个字节复制（78991ms）
//        while ((len=fis.read())!=-1){
//            fos.write(len);
//        }

        //所有字节复制（151ms）
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();

        long t = System.currentTimeMillis();
        System.out.println("耗时：" + (t - t0) + "ms");
    }
}
