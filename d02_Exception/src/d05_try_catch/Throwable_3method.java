package d05_try_catch;

/*【 Throwable 类 3 个 catch 的异常处理逻辑方法】：
 *
 * 1、public String getMessage()：返回此 Throwable 对象的【简短描述】
 *
 * 2、public String toString()：返回此 Throwable 对象的【详细消息字符串】（重写了toString）
 *
 * 3、public void printStackTrace()：打印【最全面异常信息】，JVM 默认就是用的此方法
 * */

import java.io.IOException;

public class Throwable_3method {

    public static void main(String[] args) {

        try {
            readFile("C:/a.doc");
        } catch (IOException e) {
            //1.getMessage
            String log1 = e.getMessage();
            System.out.println(log1);//传递的文件类型不对

            //2.toString
            String log2 = e.toString();
            System.out.println(log2);//java.io.IOException: 传递的文件类型不对

            //3.printStackTrace
            e.printStackTrace();//java.io.IOException: 传递的文件类型不对 at... ...
        }
        System.out.println("后续代码");

    }

    public static void readFile(String path) throws IOException {
        if (!path.endsWith(".txt")) {
            throw new IOException("传递的文件类型不对");
        }
        System.out.println("传递的文件OK");
    }
}
