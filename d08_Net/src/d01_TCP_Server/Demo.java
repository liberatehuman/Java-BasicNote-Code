package d01_TCP_Server;
/*
 * 【java.net.ServerSocket 类】：表示服务器的类，接收客户端请求
 *
 * 【构造方法】：
 *       ServerSocket(int port)：创建一个服务器流套接字，指定端口
 *
 * 【成员方法】：
 *       Socket accept()：监听，并返回此套接字连接的客户端对象
 *
 *       void close()：关闭套接字
 *
 * 【实现步骤】：
 *  1、创建 ServerSocket 客户端对象，构造方法绑定【端口号】
 *
 *  2、使用 ServerSocket 的 accept 方法，【获取客户端 Socket 对象】
 *
 *  3、使用 Socket 的 getInputStream 方法
 *
 *  4、使用 InputStream 对象的 read 方法，从【客户端】【读取数据】
 *
 *  5、使用 Socket 的 getOutputStream 方法
 *
 *  6、使用 OutputStream 对象的 write 方法，向【客户端】【发送数据】
 *
 *  7、释放资源（Socket、ServerSocket 的 close）
 * */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo {

    public static void main(String[] args) throws IOException {

        //1.创建 ServerSocket 客户端对象
        ServerSocket s = new ServerSocket(8888);
        System.out.println("服务器已开启：" + s.getLocalPort());

        //2.获取客户端 Socket 对象
        Socket c1 = s.accept();

        //3.
        InputStream is = c1.getInputStream();

        //4.读
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("服务器读取：" + new String(bytes, 0, len));

        //5.
        OutputStream os = c1.getOutputStream();

        //6.写
        os.write(("收到，" + c1.getLocalSocketAddress()).getBytes());

        //7.
        c1.close();
        s.close();
    }
}
