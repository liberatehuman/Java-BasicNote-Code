package d06_StringBuilder;

/*
StringBuilder 与 String 可以相互转换

1、String -> StringBuilder：

    StringBuilder sb = new StringBuilder(String str)

2、StringBuilder -> String：

    public String toString()：将当前StringBuilder对象转成String对象
*/
public class Method_toString {

    public static void main(String[] args) {

        //String -> StringBuilder
        String str = "abc";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder：" + sb);

        //StringBuilder -> String
        String s = sb.toString();
        System.out.println("String：" + s);
    }
}
