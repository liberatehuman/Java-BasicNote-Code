package d13_String;
/*
【java.lang.String】：字符串

    - API写道：Java程序中所有字符串面值（如"ABC"）都作为此类的实例实现
    （即，所有双引号""字符串都是String类的对象，哪怕没有new也照样是）

【特点】：
 1、字符串内容【永不改变】【重点】

 2、由于不可改变，字符串可共享使用

 3、字符串效果相当于char[]字符数组，但底层原理byte[]字节数组（计算机实际存的都是字节）（参见源码）

【创建字符串】3+1种方式：
 构造方法：
 1、public String()：创建空字符串，什么也没有（空，但输出不是null；源码）

 2、public String(char[] array)：根据字符数组内容创建字符串

 3、public String(byte[] array)：根据字节数组内容创建字符串

 直接创建：
 4、String str = "ABC";

【注】：直接写上双引号，就是字符串对象（自动帮new好了）
*/

public class Demo {

    public static void main(String[] args) {

        String str1 = new String();
        System.out.println(str1);

        char[] array1 = {'A', 'B', 'C'};
        String str2 = new String(array1);
        System.out.println(str2);

        byte[] array2 = {48, 65, 97}; // ASCII十进制码
        String str3 = new String(array2);
        System.out.println(str3);

        String str4 = "Hello World！";
        System.out.println(str4);
    }
}
