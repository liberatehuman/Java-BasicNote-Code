package d02_EX_uploadfile;
/*
 * 【综合案例（服务器）】：服务器读取并保存保存客户端发来的文件到硬盘
 *
 *       - 需要两种流对象：
 *           本地输出流：将文件写入服务器硬盘
 *           网络流：客户端与服务器之间通信
 *
 * 【明确】：
 *       - 数据源：客户端
 *       - 目的地：硬盘（服务器）
 *
 * 【步骤】：
 *  1、创建 ServerSocket 服务器对象，绑定 port
 *
 *  2、使用 accept 接受请求的客户端对象
 *
 *  3、使用 getInputStream 获取【网络】字节输入流对象
 *
 *  4、创建 File 对象抽象路径，绑定文件保存目录
 *
 *  5、判断 目录是否存在(boolean exists)，若没有则 mkdirs 创建目录
 *
 *  6、创建 FOS 【本地】字节输出流对象，绑定目的地
 *
 *  7、【网络流】read 客户端发来的文件内容，【本地流】对象 write 写入文件到硬盘
 *
 *  8、使用 getOutputStream 创建【网络流】对象并 write 回写反馈给客户端
 *
 *  9、释放资源（FOS，Socket，ServerSocket）
 * */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        //1.
        ServerSocket s = new ServerSocket(8888);

        //2.
        Socket c = s.accept();
        System.out.println("服务器--监听中");

        //3.
        InputStream is_Net = c.getInputStream();

        //4.
        File file = new File("d08_Net//Server files");

        //5.
        if (!file.exists()) {//判断目录是否存在
            file.mkdirs();//创建目录
        }

        //6.
        FileOutputStream fos = new FileOutputStream(file + "//1.txt");

        //7.
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is_Net.read()) != -1) {//读取客户端发来文件
            fos.write(bytes, 0, len);//写入硬盘
        }

        //【***客户端禁用输出流后，服务器得知发送完毕，才会执行后续代码】
        //8.
        c.getOutputStream().write("服务器--收到".getBytes());

        //9.
        fos.close();
        c.close();
        s.close();
    }
}
