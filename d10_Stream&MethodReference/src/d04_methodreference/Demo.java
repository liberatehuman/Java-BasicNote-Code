package d04_methodreference;

/*
 * 【方法引用】：对 Lambda 的优化
 *
 *       - Lambda 表达式的目的：传递参数 s 给 System.out 对象，然后调用 out 对象的 println 方法
 *
 *       - 可以使用 System.out【直接调用（引用）】println 方法
 *
 * 【注】：
 *       - System.out 【对象】是【已经存在的】
 *
 *       - println 【方法】也是【已经存在的】
 *
 * */
public class Demo {

    //定义可传递函数式接口 Calculable 的方法
    public static void method(Printable printable) {
        printable.show("HelloWorld");
    }

    public static void main(String[] args) {

//        method(new Calculable() {
//            @Override
//            public void show(String s) {
//                System.out.println(s);
//            }
//        });

        method((s) -> System.out.println(s));//Lambda

        method(System.out::println);//直接引用
    }
}
