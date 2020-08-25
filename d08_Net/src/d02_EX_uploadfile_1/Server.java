package d02_EX_uploadfile_1;
/*
 * 【优化】：
 *  1、使服务器一直监听，而不是接受一次就结束（死循环，去掉server.close）
 *
 *  2、使用多线程，提高程序效率（文件上传部分）
 *
 *  3、保存的文件名不写死（一般网络下载文件都采用【毫秒值 + 随机数】作为文件名）
 *
 * 【注】：Runnable 接口中的 run 方法没有声明任何异常，那么重写也不能声明，只能捕获处理
 *
 * */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {

    public static void main(String[] args) throws IOException {

        //1.
        ServerSocket s = new ServerSocket(8888);

        //【优化】：保持监听状态
        while (true) {
            //2.
            Socket c = s.accept();
            System.out.println("服务器--监听中");

            //【优化】：使用多线程
            new Thread(new Runnable() {
                //文件上传部分
                @Override
                public void run() {
                    //只能捕获处理
                    try {
                        //3.
                        InputStream is_Net = c.getInputStream();
                        //4.
                        File file = new File("d08_Net//Server files");
                        //5.
                        if (!file.exists()) {
                            file.mkdirs();
                        }

                        //【优化】：文件名不写死
                        String fileName = "2020_" + System.currentTimeMillis() +"_"+
                                new Random().nextInt(999) + ".txt";
                        //6.
                        FileOutputStream fos = new FileOutputStream(file +"//"+ fileName);
                        //7.
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is_Net.read()) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        //8.
                        c.getOutputStream().write("服务器--收到".getBytes());
                        //9.
                        fos.close();
                        c.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();


        }


    }
}
