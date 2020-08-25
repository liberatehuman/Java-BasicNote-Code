package d06_StringBuilder;

/*
【java.lang.StringBuilder】：【内容可变】的字符串类，又称【字符串缓冲区】

    - String 底层：被 final 修饰的 byte[]，而 StringBuilder 则没有

【构造方法】：
 1、StringBuilder()：构造一个不带任何内容的字符串生成器，【初始容量：16 个字符】

 2、StringBuilder(String str)：构造一个的字符串生成器，并初始化为指定内容

【常用成员方法】：
 1、public StringBuilder append(.)：添加任意类型数据的字符串形式，返回【当前对象本身】

 2、public String toString()：将当前StringBuilder对象转成String对象
*/

public class Demo {

    public static void main(String[] args) {

        //无参构造
        StringBuilder sb1 = new StringBuilder();
        System.out.println("字符串1：" + sb1);

        //含参构造
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("字符串2：" + sb2);
    }
}
