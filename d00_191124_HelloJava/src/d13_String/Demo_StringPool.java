package d13_String;
/*
【字符串常量池】：堆内存的一特殊部分

【直接写上双引号""的字符串】，就放在字符串常量池中

    - 对于基本类型，== 比较的是数值（因为基本类型没地址）

    - 对于引用类型，== 比较的是地址值
*/

public class Demo_StringPool {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc"; //"abc"在池子里，直接可以共用，所以指向同一字符串

        char[] array = {'a', 'b', 'c'};
        String str3 = new String(array);

        System.out.println(str1 == str2); //true    str1和str2的字符串存放在池中，指向同一byte[]
        System.out.println(str1 == str3); //false   str3是new出来的对象，不在池中
        System.out.println(str2 == str3); //false
    }
}
