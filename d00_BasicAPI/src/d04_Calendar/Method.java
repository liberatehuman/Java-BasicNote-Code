package d04_Calendar;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类的常用【成员方法】：

（field：日历字段YEAR,MONTH,DAY_OF_MONTH,HOUR...）

1、public int get(int field)：获取给定日历字段（field）的值
2、public void set(int field, int value)：设置给定日历字段的值
3、public abstract void add(int field, int amount)：增/减给定日历字段的时间值
4、public Date getTime()：返回一个表示此Calendar时间值（ms偏移量）的Date对象
*/

public class Method {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //get
        int y = calendar.get(Calendar.YEAR);
        System.out.println(y);

        //set
        calendar.set(Calendar.MONTH, 9);//西方月份0~11，9->Oct

        //add
        calendar.add(Calendar.DAY_OF_MONTH, -1);//正数为加，负数为减

        //getTime
        Date date = calendar.getTime();

        System.out.println(date);
    }
}
