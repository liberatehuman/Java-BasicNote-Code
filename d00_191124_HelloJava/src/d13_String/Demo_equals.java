package d13_String;

/*
1、== 是字符串【地址值】的比较方法

2、字符串【内容比较】方法：
    public boolean equals(Object obj)：参数可以是任意对象，只有参数是一个字符串且内容相同才返回true

【注】：
    1）任何对象都能用Object接收

    2）.equals方法具有对称性（ public_a.equals(protected_b)等价于b.equals(public_a) )

    3)推荐常量字符串在前，变量字符串在后（ "abc".equals(str) ）（防止str为null引发空指针异常）

2、public boolean equalsIgnoreCase(String str)：忽略大小写的字符串内容比较
*/

public class Demo_equals {

    public static void main(String[] args) {
        //equals方法
        String str1 = "hello";
        String str2 = "hello";
        char[] array = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(array);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));
        System.out.println("Hello".equals(str1));
        System.out.println("—————————");

        String str4 = null;
        System.out.println("hello".equals(str4));
        //SystemDemo.out.println(str4.equals("hello")); //报错：空指针异常NullPointerException
        System.out.println("—————————");

        //equalsIgnoreCase
        System.out.println("HELLO".equalsIgnoreCase(str1));
        System.out.println("abc二".equalsIgnoreCase("abc贰")); //区分中文大小写
    }
}
