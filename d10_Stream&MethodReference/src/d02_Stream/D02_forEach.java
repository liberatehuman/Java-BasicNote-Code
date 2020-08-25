package d02_Stream;
/*
 * 【Stream 流常用方法：forEach】：遍历
 *
 *       void forEach(Consumer<? super T> action);
 *
 *       - 传递一个【Consumer 接口】函数，将每一个流元素交给函数处理（重写 accept 方法）
 *
 * 【记】：
 *  1、【终极方法】（执行后不能调用流的其他方法）
 *
 *  2、遍历流中的元素
 * */

import java.util.function.Consumer;
import java.util.stream.Stream;

public class D02_forEach {

    public static void main(String[] args) {

        //获取流对象
        Stream<String> stream = Stream.of("张三", "李四", "王五");

        //匿名内部类
//        stream.forEach(new Consumer<String>() {//参数传递 Consumer 接口
//            @Override
//            public void accept(String s) {
//                System.out.println(s);//定义使用方法，"消费"数据
//            }
//        });

        //Lambda
        stream.forEach((s) -> System.out.println(s));
    }
}
