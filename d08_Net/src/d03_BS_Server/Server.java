package d03_BS_Server;

//【未完成】

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket s = new ServerSocket(8080);

        while (true){

            Socket browser = s.accept();

            try {
                InputStream is = browser.getInputStream();

                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                int len = 0;
                byte[] bytes = new byte[1024];
//                while ((len = is.read(bytes)) != -1) {
//                    System.out.println(new String(bytes, 0, len));
//                }
                System.out.println(br.readLine());

//                String line = br.readLine();
//                String[] arr = line.split("");
//                String path = arr[1].substring(1);
            }catch (IOException e){
                System.out.println(e);
            }



        }


    }
}
