package d13_String;
/*
【字符串获取的相关方法】
 1、public int length()：获取字符串的字符个数，即字符串长度

 2、public String concat(String str)：将当前字符串和参数字符串拼接成返回值新的字符串

 3、public char charAt(int index)：获取指定索引位置的单个字符

 4、public int indexOf(String str)：查找当前字符串在本字符串的第一次索引位置，若没有则返回-1
*/

public class Demo_get {

    public static void main(String[] args) {
        //获取长度
        System.out.println("字符串长度：" + "283567283652873646".length());
        System.out.println("———————————————");

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1.concat(str2));//只能创建一个新的字符串，不是原字符串变了
        System.out.println(str1);//字符串内容不可变
        System.out.println(str2);
        System.out.println("———————————————");

        //获取索引位置单个字符
        System.out.println("1号索引字符是：" + "Hello".charAt(1));
        System.out.println("———————————————");

        //查找位于本字符串的第一个字符索引
        System.out.println("llo第一次索引是：" + "Hello".indexOf("llo"));
        System.out.println("Hello".indexOf("xxx")); //若要查询的不在本字符串内，则返回-1
    }
}
