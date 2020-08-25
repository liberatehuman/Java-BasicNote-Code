package d02_Stream;
/*
 * 【Stream 流常用方法：filter】：过滤
 *
 *       Stream<T> filter(Predicate<? super T> predicate);
 *
 *       - 传递一个【Predicate 接口】函数，对流元素进行【过滤】（重写 test 方法）
 *
 * 【记】：
 *  1、延迟方法（执行后返回新的流对象，能继续调用流的其他方法）
 *
 *  2、过滤流中的元素
 * */

import java.util.function.Predicate;
import java.util.stream.Stream;

public class D03_filter {

    public static void main(String[] args) {

        //获取流对象
        Stream<Integer> stream = Stream.of(-1, 0, 1, 3);

        //匿名内部类
//        Stream<Integer> stream1 = stream.filter(new Predicate<Integer>() {//参数传递 Predicate 接口
//            @Override
//            public boolean test(Integer integer) {
//                return (-1 < integer && integer < 1);//定义过滤条件
//            }
//        });
        //Lambda
        Stream<Integer> stream1 = stream.filter((i) -> (-1 < i && i < 1));

        stream1.forEach((i) -> System.out.println(i));//遍历打印流元素 0

    }
}
