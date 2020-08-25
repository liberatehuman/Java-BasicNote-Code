package d02_Stream;
/*
 * 【Stream 流常用方法：concat】：组合
 *
 *       static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b);
 *
 *       - 两个流组合到一个新的流中
 *       - 静态方法，Stream 接口可直接调用，返回新的流
 *
 * 【记】：
 *  1、延迟方法
 *
 *  2、把两个流组合到一个新的流
 * */

import java.io.Serializable;
import java.util.stream.Stream;

public class D08_concat {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("张三", "李四", "王五");//流1
        Stream<String> stream2 = Stream.of("哈", "哈", "哈");//流2

        Stream<String> stream3 = Stream.concat(stream1, stream2);

        stream3.forEach((s) -> System.out.println(s));
    }
}
