package d02_FunctionalCoding;
/*
 * 【函数式接口】-- 作为方法【返回值类型】
 *
 * 【举例】：
 *      - java.util.Comparator （函数式）接口
 *      - 重写 compare 方法
 *
 * */

import java.util.Arrays;
import java.util.Comparator;

public class D03_FunctionalInterface_return {

    public static void main(String[] args) {

        String[] arr = {"aaaaaa", "aa", "a", "aaa"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, getComparator());//一位一位比ASCII码？
        System.out.println(Arrays.toString(arr));//[aaaaaa, aaa, aa, a]

    }

    //返回值为函数式接口的方法
    public static Comparator<String> getComparator() {
        //1.匿名对象
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        };

        //2.Lambda 表达式
        return (o1, o2) -> o2.length() - o1.length();
    }
}
