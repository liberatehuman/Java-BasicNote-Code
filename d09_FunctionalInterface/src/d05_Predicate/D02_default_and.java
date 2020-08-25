package d05_Predicate;
/*
 * 【Predicate 接口的默认方法 1】：and，用于两个条件下对数据的判断（分别一个Predicate接口实现）
 *
 *      default Predicate<T> and(Predicate<? super T> other) {
 *          Objects.requireNonNull(other);
 *          return (t) -> this.test(t) && other.test(t);//两个判断条件的底层也是 && 运算符实现的
 *      }
 *
 * */

import java.util.function.Predicate;

public class D02_default_and {

    public static boolean check(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //return pre1.test(s) && pre2.test(s);

        //and
        return pre1.and(pre2).test(s);//等价于 return pre1.test(s) && pre2.test(s);
    }

    public static void main(String[] args) {

        boolean result = check("abc123", (s) -> s.length() > 5, (s) -> s.contains("a"));
        System.out.println(result);//true
    }
}
