package d03_DateFormat;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
/*
【java.text.DateFormat】：日期/时间格式化的【抽象类】

成员方法：
1、格式化：Date日期 -> 自定文本
    String format(Date date)    //将Date转化为指定模式的字符串文本

2、解析：自定文本 -> Date日期
    Date parse(String source)   //将字符串文本转回Date日期

***DateFormat抽象类无法直接创建对象使用，必须用子类创建
-------------------------------------------------------------
【java.text.SimpleDateFormat】extends DateFormat

构造方法：
    SimpleDateFormat(String pattern)

模式（区分大小写）：
    y   年
    M   月
    d   日
    H   时
    m   分
    s   秒
如："yyyy-MM-dd HH:mm:ss"

成员方法（继承了DateFormat）：String format(Date date)、Date parse(String source)
 */
public class Demo {

    public static void main(String[] args) throws ParseException {

        //1.创建SimpleDateFormat对象，并设置模式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss");

        //2.创建Date
        Date date=new Date(0L);

        //3.【格式化】使用SimpleDateFormat中的format方法，对参数进行格式化
        String d=sdf.format(date);

        System.out.println(date);
        System.out.println("格式化："+d);

        //4.【解析】
        Date date_parse=sdf.parse("1970.01.01-08:00:00");// ParseException异常

        //【异常处理方法】：
        // (1) throws（交给 JVM 处理，即中断处理：将异常打印到控制台）
        // (2) try catch 自行处理

        System.out.println("解析后："+date_parse);
    }
}
