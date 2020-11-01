package d04_Calendar;

import java.util.Calendar;
/*
【java.util.Calendar】：日历【抽象类】（已知子类：GregorianCalendar）
提供了许多操作日历字段（YEAR,MONTH,DAY_OF_MONTH,HOUR...）的方法

获取当前日历，可使用Calendar的静态方法getInstance，直接返回Calendar的【子类对象】（多态实现）
    static Calendar getInstance()

*/


public class Demo {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();//多态（左边抽象类，右边返回子类对象）

        System.out.println(calendar);
        System.out.println(calendar.getCalendarType());//类型是gregory，即子类
    }
}
