package d02_EX_uploadfile;
/*
 * 【综合案例（客户端）】：客户端上传本地文件至服务器（基于文件复制原理）
 *
 *       - 需要两种流对象：
 *           本地输入流：读取本地文件
 *           网络流：客户端与服务器之间通信
 *
 * 【明确】：
 *       - 数据源：硬盘（本地文件）
 *       - 目的地：服务器
 *
 * 【步骤】：
 *  1、创建 FIS 【本地】字节输入流对象，用于读取本地文件
 *
 *  2、创建 Socket 客户端对象，绑定 IP 和 port
 *
 *  3、使用 getOutputStream 获取【网络】字节输出流对象
 *
 *  4、【本地流】对象 read 本地文件，【网络流】对象 write 发送到服务器
 *
 *         - Socket 对象需要调用【void shutdownOutput()】，禁用此套接字输出流，以告知服务器写完毕
 *         （客户端不会发送 read 本地文件时的 -1 标志，因此服务器也会一直 read 网络流）
 *
 *  5、使用 getInputStream 获取【网络】字节输入流对象
 *
 *  6、【网络流】read 服务器回写内容
 *
 *  7、释放资源（FIS，Socket）
 *
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
        //【***客户端发送完毕，禁用此套接字输出流，告知服务器已发送完】
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
