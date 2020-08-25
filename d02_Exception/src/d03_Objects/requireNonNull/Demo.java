package d03_Objects.requireNonNull;
/*
 * 【java.util.Objects 工具类】：包含一些静态实用方法，这些方法都是【null-tolerant/safe】
 *
 * 【requireNonNull】：查看指定引用对象是否为null
 *
 *       public static <T> T requireNonNull(T obj) {
 *           if (obj == null){
 *               throw new NullPointerException();
 *           return obj;
 *           }
 * */

import java.util.Objects;

public class Demo {

    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object o) {
        //1.手动 throw 抛出空指针异常
        //if (o==null){
        //    throw new NullPointerException("传参为空");
        //}

        //2.可以直接使用 Objects 的静态方法
        Objects.requireNonNull(o);
    }
}
