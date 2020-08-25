package d05_Predicate;
/*
 * 【java.util.function.Predicate<T> 函数式接口】：对某种数据类型的数据【判断】，并返回一个boolean值
 *
 *       boolean test(T t)：用于对指定参数 t 进行判断的方法
 *
 *       - 符合条件返回 true，反之 false
 *       - 怎么判断？重写 test 方法，自定义
 * */

import java.util.function.Predicate;

public class D01_test {

    public static boolean check(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    public static void main(String[] args) {

        //匿名内部类
//        boolean result=check("12345", new Predicate<String>() {
//            //重写 test 定义判断方法
//            @Override
//            public boolean test(String s) {
//                return s.length()<5;
//            }
//        });

        //Lambda
        boolean result = check("12345", (s) -> s.length() > 5);

        System.out.println(result);
    }

}
