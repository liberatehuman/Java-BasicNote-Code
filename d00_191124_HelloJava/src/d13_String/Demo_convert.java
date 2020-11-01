package d13_String;
/*
【字符串转换】相关方法：
 1、public char[] toCharArray()：将当前字符串拆分成字符数组作为返回值

 2、public byte[] getBytes()：获取当前字符串的底层字节数组

 3、public String replace(CharSequence oldStr, CharSequence newStr)：用新字符串替换部分原字符串

    -【CharSequence】意思是可以接受字符串类型（IO流相关知识）
*/

public class Demo_convert {

    public static void main(String[] args) {
        //字符串-->字符数组char[]
        char[] chars = "hello".toCharArray();
        System.out.println(chars[1]);

        //字符串-->字节数组byte[]
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //替换部分字符串
        String str2 = "你会不会玩啊？你大爷的！你大爷的！";
        str2.replace("你大爷的", "****");
        System.out.println(str2);
    }
}
