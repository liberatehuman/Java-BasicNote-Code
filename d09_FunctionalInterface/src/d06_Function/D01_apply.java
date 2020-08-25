package d06_Function;
/*
 * 【java.util.function.Function<T,R> 函数式接口】："转换（映射）型接口"
 *
 *       R apply(T t)：根据 T 类型数据，获取 R 类型数据
 *
 *       - <T,R>：T 成为前置条件，R 称为后置条件
 *       - 怎么转换？重写 apply 方法，自定义
 * */

import java.util.function.Function;

public class D01_apply {

    public static void convert(String s, Function<String, Integer> function) {
        int intVar = function.apply(s);
        System.out.println(intVar);
    }

    public static void main(String[] args) {
        //匿名内部类
//        convert("123", new Function<String, Integer>() {
//            重写 apply 方法定义转换方法
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        });

        //Lambda
        convert("123", (s) -> Integer.parseInt(s));//方法： int parseInt(String s)
    }
}
