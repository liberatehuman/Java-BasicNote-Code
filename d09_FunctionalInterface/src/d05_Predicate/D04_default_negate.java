package d05_Predicate;
/*
 * 【Predicate 接口的默认方法 3】：negate，用于两个条件下对数据的判断（分别一个Predicate接口实现）
 *
 *      default Predicate<T> negate() {
 *          return (t) -> !test(t);//判断条件的底层是 ! 运算符实现的
 *      }
 *
 * */

import java.util.function.Predicate;

public class D04_default_negate {

    public static boolean check(String s, Predicate<String> predicate) {
        //return !predicate.test(s);
        return predicate.negate().test(s);//等价于 return !predicate.test(s);
    }

    public static void main(String[] args) {

        boolean result = check("abc", (s) -> s.length() > 5);
        System.out.println(result);//true
    }
}
