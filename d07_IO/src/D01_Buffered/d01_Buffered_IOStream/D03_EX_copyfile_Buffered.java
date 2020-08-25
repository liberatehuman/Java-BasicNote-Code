package D01_Buffered.d01_Buffered_IOStream;
/*
* 【字节缓冲流复制文件】：更快（文件大比较明显）
* */
import java.io.*;

public class D03_EX_copyfile_Buffered {

    public static void main(String[] args) throws IOException {

        long t0 = System.currentTimeMillis();

        //可使用匿名对象，传递给缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "d07_IO//src//D01_Buffered//1.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                "d07_IO//src//D01_Buffered//2_copy.jpg"));

        int len = 0;

        //单个字节复制（302ms）
//        while ((len=bis.read())!=-1){
//            bos.write(len);
//        }

        //所有字节复制（77ms）
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();

        long t = System.currentTimeMillis();
        System.out.println("耗时：" + (t - t0) + "ms");
    }
}
