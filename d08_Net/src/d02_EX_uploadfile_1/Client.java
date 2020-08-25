package d02_EX_uploadfile_1;
/*
 * 【综合案例（客户端）】：客户端上传本地文件至服务器（基于文件复制原理）
 *
 * */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        //1.本地输入流
        FileInputStream fis = new FileInputStream("d08_Net//1.txt");

        //2.客户端对象
        Socket c = new Socket("127.0.0.1", 8888);

        //3.网络输出流
        OutputStream os_Net = c.getOutputStream();

        int len = 0;
        byte[] bytes = new byte[1024];

        //4.
        while ((len = fis.read(bytes)) != -1) {//本地输入流读取本地文件
            os_Net.write(bytes, 0, len);//网络输出流发送到服务器
        }

        c.shutdownOutput();
        System.out.println("客户端--发送完毕");

        //5.网络输入流
        InputStream is_Net = c.getInputStream();

        //6.网络输入流读取服务器回写
        while ((len = is_Net.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //7.释放资源
        fis.close();
        c.close();

    }
}
