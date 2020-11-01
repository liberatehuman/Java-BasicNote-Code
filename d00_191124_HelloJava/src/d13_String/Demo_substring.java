package d13_String;
/*
【截取字符串】：
 1、public String substring(int index)：截取从索引位置往后的全部字符串

 2、public String substring(int begin, int end)：截取区间[begin,end)内的字符串
*/

public class Demo_substring {

    public static void main(String[] args) {

        String str1 = "HelloWorld!";
        String str2 = str1.substring(3);
        System.out.println(str2);
        System.out.println(str1); //str1不会变，感觉变了只是产生了一个新的字符串

        System.out.println(str1.substring(3, 6)); //截取3、4、5索引范围的字符串
        System.out.println("————————————");

        //字符串内容仍然没变
        //改变的是str中保存的【地址值】
        String str = "hello"; //把hello字符串的【地址值】0x666赋给str
        System.out.println(str); //hello

        str = "java"; //把字符串java的【地址值】0x999 赋给str
        System.out.println(str); //java
    }
}
