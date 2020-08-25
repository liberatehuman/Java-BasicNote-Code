package d07_packagingclass;

/*
 * 【字符串 <--> 基本类型转换】
 *
 * 【基本类型 --> 字符串】：
 *  1、xxx +"..."：直接拼接
 *  2、static String toString(参)：包装类的静态方法，【不是Object类的toString()重载】
 *  3、static String valueOf(参)：String类的静态方法
 *
 * 【字符串 --> 基本类型】：
 *  1、static xxx parseXxx(String s)：包装类的静态方法（Xxx=Integer、Double、Byte...）
 *
 * */
public class Demo_String_convert {

    public static void main(String[] args) {

        //1.1 直接拼接
        int a1 = 10;
        System.out.println(a1 + "1");//101

        //1.2 Integer.toString()
        Integer a2 = 10;
        String s = a2.toString();
        System.out.println(s + 1);//101

        //1.3 String.valueOf(...)
        System.out.println(String.valueOf(10) + 1);


        //2.1 parseXxx(String s)
        int a3 = Integer.parseInt(s);
        System.out.println(a3);
    }
}
