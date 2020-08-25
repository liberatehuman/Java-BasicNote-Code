package d02_Date;

//【Date类】的一些常用方法

import java.util.Date;

public class Method {

    public static void main(String[] args) {

        //1.无参构造方法
        Date date3 = new Date();//当前时刻（官方已用ToString重写，打印出的不是ms值）
        System.out.println(date3);

        //2.含参构造方法
        Date date1 = new Date(0L);//时间原点
        System.out.println(date1);
        Date date2 = new Date(1585311041297L);//此时刻
        System.out.println(date2);

        //3. long getTime()方法
        System.out.println(date1.getTime());//打印出该时刻的ms值，= SystemDemo.currentTimeMillis()
    }
}
