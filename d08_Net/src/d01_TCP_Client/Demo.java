package d01_TCP_Client;
/*
 * 【java.net.Socket 类】：表示客户端的类，实现客户端套接字（IP:port）
 *
 * 【构造方法】：
 *       Socket(String host, int port)：创建一个流套接字，将其连接到指定主机上的指定端口
 *           - host IP地址，port 端口号
 *
 * 【成员方法】：
 *       OutputStream getOutputStream()：返回此套接字的输出流
 *
 *       InputStream getInputStream()：返回此套接字的输入流
 *
 *       void close()：关闭套接字
 *
 * 【实现步骤】：
 *  1、创建 Socket 客户端对象，构造方法绑定【IP 地址】、【端口号】
 *
 *  2、使用 Socket 的 getOutputStream 方法，获取网络字节输出流对象
 *
 *  3、使用 OutputStream 对象的 write 方法，向服务器【发送数据】
 *
 *  4、使用 Socket 的 getInputStream 方法，获取网络字节输入流对象
 *
 *  5、使用 InputStream 对象的 read 方法，从服务器【读取数据】
 *
 *  6、释放资源（Socket 的 close）
 * */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo {

    public static void main(String[] args) throws IOException {

        //1.创建 Socket 客户端对象
        Socket c = new Socket("127.0.0.1", 8888);//若该服务器没开，ConnectException

        //2.
        OutputStream os = c.getOutputStream();

        //3.写
        os.write("客户端发送数据".getBytes());

        //4.
        InputStream is = c.getInputStream();

        //5.读
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("客户端读取：" + new String(bytes, 0, len));

        //6.
        c.close();
    }
}
