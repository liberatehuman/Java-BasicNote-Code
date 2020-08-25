package d02_Date;

/*
【java.util.Date 类】：表示日期和时间的类，指特定的瞬间，精确到毫秒 ms
    2020-03-27 19:59:666 这一时刻

精确到 ms 的作用：计算时间长度

【计算步骤】：
1、时间原点（0 ms）：1970-01-01 00:00:000（英国格林威治）
   -中国东八区原点：1970-01-01 08:00:000

2、将两个时刻换算成到时间原点的ms值（Long型），相计算

1 day = 24*60*60*1000 = 86400000L（ms）

*/
public class Millisecond {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());//获取当前时刻ms值
    }
}
