package d06_Function;
/*
 *【Function 接口的默认方法】：andThen（调用一次就是转换一次）
 *
 *       default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
 *
 *       - 将两个 Function 接口组合到一起操作
 *
 *       - 与 apply 一起用，相当于转换两次数据类型
 * */

import java.util.function.Function;

public class D02_andThen {

    public static void convert(String s, Function<String, Integer> f1, Function<Integer, String> f2) {
        //int i = f1.apply(s);//字符串转int
        //String s1 = f2.apply(i+1);//int转字符串

        //andThen 组合操作
        String result = f1.andThen(f2).apply(s);
        System.out.println(result);
    }

    public static void main(String[] args) {

        convert("123",
                (s) -> Integer.parseInt(s),//先字符串转为int类型
                (i) -> i + 1 + "是字符串");//再加一，并转为字符串
    }
}
