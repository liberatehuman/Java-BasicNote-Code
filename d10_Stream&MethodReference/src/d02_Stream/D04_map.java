package d02_Stream;
/*
 * 【Stream 流常用方法：map】：映射
 *
 *       <R> Stream<R> map(Function<? super T, ? extends R> mapper);
 *
 *       - 传递一个【Function 接口】函数，将流 Stream<T> 的元素【映射】到新的流 Stream<R> 中（重写 apply 方法）
 *
 * 【记】：
 *  1、延迟方法
 *
 *  2、映射流中的元素到新的流
 * */

import java.util.function.Function;
import java.util.stream.Stream;

public class D04_map {

    public static void main(String[] args) {

        //获取流对象
        Stream<String> stream = Stream.of("1", "2", "3");

        //匿名内部类
//        Stream<Integer> stream1 = stream.map(new Function<String, Integer>() {//参数传递 Function接口
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s) + 1;//定义"映射"关系
//            }
//        });

        //Lambda
        Stream<Integer> stream1 = stream.map((s) -> Integer.parseInt(s) + 1);

        stream1.forEach((i) -> System.out.println(i));//遍历流元素 2 3 4
    }
}
