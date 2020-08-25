package d10_generic泛型;
/*
 *【含有泛型的方法】：
 *      - 当调用含有泛型的方法时，确定泛型的数据类型
 *
 *      - 传参什么类型，泛型就是什么类型
 * */

public class DemoGenericMethod {

    public static void main(String[] args) {

        //1.普通泛型方法
        GenericMethod g1 = new GenericMethod();//创建对象

        g1.method1(1);//传参什么类型，泛型A就是什么类型
        g1.method1(1.5);//可传递任意类型...
        g1.method1("a");
        g1.method1(true);


        //2.静态泛型方法（直接【类名.方法名()】，不建议创建对象使用）
        GenericMethod.method2(2);//同样，传参什么类型，泛型B就是什么类型
        GenericMethod.method2(2.5);//可传递任意类型...
        GenericMethod.method2("b");
        GenericMethod.method2(true);

    }


}
