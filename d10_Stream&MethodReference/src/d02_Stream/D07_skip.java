package d02_Stream;
/*
 * 【Stream 流常用方法：skip】：跳过
 *
 *       Stream<T> skip(long n);
 *
 *       - 跳过流中【前 n 个】元素，剩余保存到返回的流中
 *
 * 【记】：
 *  1、延迟方法
 *
 *  2、跳过流中前几个元素，其余保存到新的流
 * */

import java.util.stream.Stream;

public class D07_skip {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> stream1 = stream.skip(3);

        stream1.forEach((i)-> System.out.println(i));//4 5
    }
}
