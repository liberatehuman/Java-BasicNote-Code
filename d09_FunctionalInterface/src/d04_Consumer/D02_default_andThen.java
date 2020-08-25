package d04_Consumer;

import java.util.function.Consumer;

public class D02_default_andThen {

    public static void method(String s, Consumer<String> consumer1, Consumer<String> consumer2) {
        //consumer1、2 都消费 s
        consumer1.accept(s);
        consumer2.accept(s);

        //andThen 方法实现同样功能
        consumer1.andThen(consumer2).accept(s);
    }

    public static void main(String[] args) {

        method("Hello",
                (s) -> System.out.println(s.toUpperCase()),//两个Lambda
                (s) -> System.out.println(s.toLowerCase()));
    }
}
