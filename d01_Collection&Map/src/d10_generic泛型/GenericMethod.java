package d10_generic泛型;
/*
 * 【含有泛型的方法】定义格式：
 *
 *      public (static) <泛型> 返回值类型 方法名(泛型 参数列表) {
 *          方法体...
 *      }
 *
 * */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public <A> void method1(A a) {
        System.out.println("泛型方法1执行：" + a);
    }

    public static <B> void method2(B b) {
        System.out.println("静态泛型方法2执行：" + b);
    }

    public <C> void method3() {
        ArrayList<C> list = new ArrayList<>();
    }

}
