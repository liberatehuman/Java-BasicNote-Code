package d02_Stream;
/*
 * 【Stream 流常用方法：limit】：截取
 *
 *       Stream<T> limit(long maxSize);
 *
 *       - 截取流中【前 maxSize 个】元素，并保存到返回的流中
 *
 * 【记】：
 *  1、延迟方法
 *
 *  2、截取流中前几个元素【保存到新的流】
 * */

import java.util.stream.Stream;

public class D06_limit {

    public static void main(String[] args) {

        //获取流对象
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        //截取前3个流元素，新流对象接收
        Stream<Integer> stream1 = stream.limit(3);

        stream1.forEach((i) -> System.out.println(i));//遍历 1 2 3
    }
}
