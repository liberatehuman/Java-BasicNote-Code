package d06_Function;
/*
* 【练习】：自定义函数模型拼接
*
*  要求：用Function接口，对字符串进行以下操作
*
*       1、字符串截取最后的数字部分（字符串 -> 字符串）
*
*       2、将字符串变为整型数值（字符串 -> 整型数字）
*
*       3、数字加值（整型 -> 整型）
*

*  */
import java.util.function.Function;

public class EX {

    public static void method(String s, Function<String, String> f1,
                              Function<String, Integer> f2, Function<Integer, Integer> f3) {
        //分步
        //int i1=f1.andThen(f2).apply(s);//1.字符串转字符串、2.字符串转int
        //int i2=f3.apply(i1);//int转int

        //链式拼接
        int result = f1.andThen(f2).andThen(f3).apply(s);
        System.out.println(result);
    }

    public static void main(String[] args) {

        method("我身高：182",
                (s) -> s.split("：")[1],
                (s) -> Integer.parseInt(s),
                (i) -> i + 3);
    }

}
