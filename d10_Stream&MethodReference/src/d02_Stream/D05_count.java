package d02_Stream;
/*
 * 【Stream 流常用方法：count】：计数
 *
 *       long count();
 *
 *       - 返回流中的元素个数（long 类型范围更广）
 *
 * 【记】：
 *  1、【终极方法】（执行后不能调用流的其他方法）
 *
 *  2、统计流中元素个数
 * */

import java.util.stream.Stream;

public class D05_count {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 3, 5, 7, 9, 11, 13, 15, 17);

        long count = stream.count();

        System.out.println(count);//9
    }
}
