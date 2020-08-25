package d03_Supplier;
/*
 * 【java.util.function.Supplier<T> 函数式接口】："生产型接口"
 *
 *       T get()：用于获取一个泛型参数指定类型的对象数据
 *
 *       - 接口泛型是什么类型，其仅有抽象方法 get 就会"生产"（返回）什么类型的数据
 *       - 怎么生产？重写 get 方法，自定义
 * */

import java.util.function.Supplier;

public class D01_get {

    public static void main(String[] args) {

        //匿名内部类
//        String s = getString(new Supplier<String>() {
//            //重写 get 定义如何生产
//            @Override
//            public String get() {
//                return "Hello";
//            }
//        });

        //Lambda
        String s = getString(() -> "Hello");//生产指定的字符串

        System.out.println(s);
    }

    //创建参数为 Supplier 接口的方法
    public static String getString(Supplier<String> stringSupplier) {
        return stringSupplier.get();//用于获取泛型类型的数据
    }
}
