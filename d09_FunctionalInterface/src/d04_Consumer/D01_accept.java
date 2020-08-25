package d04_Consumer;
/*
 * 【java.util.function.Consumer<T> 函数式接口】："消费型接口"
 *
 *       void accept(T t)：消费数据 t，类型由泛型决定
 *
 *       - 接口泛型是什么类型，其仅有抽象方法 accept 就会"消费"（使用）什么类型的数据
 *       - 怎么消费？重写 accept 方法，自定义
 * */

import java.util.function.Consumer;

public class D01_accept {

    public static void method(String s,Consumer<String> stringConsumer){
        stringConsumer.accept(s);
    }

    public static void main(String[] args) {

        //匿名内部类
//        method("12345", new Consumer<String>() {
//            //重写 accept 定义如何消费
//            @Override
//            public void accept(String name) {
//                System.out.println(new StringBuilder(name).reverse().toString());
//            }
//        });

        //Lambda
        method("12345",(name)->
            System.out.println(new StringBuilder(name).reverse().toString()));
    }
}
