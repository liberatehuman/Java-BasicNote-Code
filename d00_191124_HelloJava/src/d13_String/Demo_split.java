package d13_String;

/*
【分割字符串】：
        public String split(String regex):按照参数规则，将字符串分割成若干字符串。可保存到字符串数组查看

 其中的参数：【regex(regular expression)】是正则表达式。若要以"."分割必须写成"\\."
 */

public class Demo_split {

    public static void main(String[] args) {

        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("——————");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("——————");

        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split("\\."); //正则表达式的"."有特殊含义
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}
