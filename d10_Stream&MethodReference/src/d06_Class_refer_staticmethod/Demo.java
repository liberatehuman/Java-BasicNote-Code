package d06_Class_refer_staticmethod;
/*
 * 【类名 引用 静态方法】：静态的属于类而不是对象（静态先于对象）
 *
 * 【前提】：
 *  1、【类】是【已经存在的】
 *
 *  2、【静态方法】也是【已经存在的】
 * */

public class Demo {

    public static int method(int number, Calculable calculable) {
        return calculable.show(number);
    }

    public static void main(String[] args) {

//        int result = method(-10, new Calculable() {
//            @Override
//            public int show(int number) {
//                return Math.abs(number);//使用 java.lang.Math 类的静态方法 abs
//            }
//        });

        int result = method(-10, Math::abs);//Math 类已存在，静态方法 abs 已存在，可引用

        System.out.println(result);

    }

}
