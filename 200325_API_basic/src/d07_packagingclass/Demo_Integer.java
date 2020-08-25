package d07_packagingclass;

/*
 * 【Integer包装类】
 *
 * 【装箱】：
 *  1、构造方法
 *       Integer(int value)：创建一个表示指定int值的Integer对象
 *       Integer(String s)：创建一个指定字符串所表示int值的Integer对象
 *
 *  2、静态方法
 *       static Integer valueOf(int value)
 *       static Integer valueOf(String s)
 *
 * 【拆箱】：
 *  1、成员方法
 *       int intValue()：返回该Integer所表示的int值
 */
public class Demo_Integer {

    public static void main(String[] args) {

        //装箱：
        Integer integer1 = new Integer(9);//划线说明过时了
        System.out.println(integer1);//9，说明重写了toString方法

        Integer integer2 = new Integer("9");
        //Integer integer2 = new Integer("z");//NumberFormatException
        System.out.println(integer2);

        //拆箱
        int int1 = integer1.intValue();
        System.out.println(int1);

        System.out.println(int1 == integer1);//true，比较的是数值
        System.out.println(integer1 == integer2);//false，比较的是两个对象的地址(都是new的，故不同）
    }
}
