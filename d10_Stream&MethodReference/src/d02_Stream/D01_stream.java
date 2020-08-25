package d02_Stream;
/*
 * 【java.util.stream.Stream<T> 接口】：Java 8 新加入的最常用接口（非函数式接口）
 *
 * 【特点】：
 *      - Stream 流【只能使用一次】，执行完一次操作，本Stream流关闭，返回一个新的流继续...直到执行完终结方法
 *  -------------------
 * 【获取流的方式】：
 *  1、所有 Collection 集合均可通过默认方法 stream 【获取流】：
 *
 *       default Stream<E> stream()
 *
 *  2、Stream 接口的静态方法 of 可以获取【数组对应的流】：
 *
 *       static <T> Stream<T> of(T... values)//参数是可变参数，那么可以传递数组（可变底层就是数组）
 * */

import java.util.*;
import java.util.stream.Stream;

public class D01_stream {

    public static void main(String[] args) {

        //【Collection】集合包含 stream 方法
        //1.List
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        //2.Set
        HashSet<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        //【Map】只能通过键/值/键值对集合获取Stream
        HashMap<String, String> map = new HashMap<>();
        //1.
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        //2.
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        //3.
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entrySet.stream();

        //【Stream 接口方法：of 】
        //参数传递数组
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4);
        //参数传递 ...可变参数
        String[] strs = {"a", "b", "c"};
        Stream<String> stream7 = Stream.of(strs);
        Integer[] ints = {1, 2, 3};
        Stream<Integer> stream8 = Stream.of(ints);

    }
}
