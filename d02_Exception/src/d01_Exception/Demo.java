package d01_Exception;
/*
* 【java.lang.Throwable 类】：所有异常/错误的根类
*
* 【分类】
* 1、异常（感冒，可解决）：
*    Exception：编译期异常（throws / try catch）
*    RuntimeException：运行时异常（try catch）
*
* 2、错误（绝症，只能避免；必须修改代码处理）
*    Error
*
* */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        //1.【异常】
        //1-1.Exception 编译期异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //Date date = sdf.parse("1999-09-09");// ParseException异常

        //方式(1)：throws ParseException
        //方式(2)：try catch
        try {
            Date date = sdf.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("异常1已处理");

        //1-2.RuntimeException 运行时异常
        int[] arr = {1, 2, 3};
        //System.out.println(arr[3]);// ArrayIndexOutOfBoundsException
        //方式(1)：try catch
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println(e);//打印出异常
        }
        System.out.println("异常2已处理");


        //2.【错误】Error
        //int[] arr2 = new int[1024*1024*1024];// OutOfMemoryError
        //方式(1)：修改代码
        int[] arr2 = new int[1024 * 1024];
        System.out.println(arr2);// OutOfMemoryError
    }
}
