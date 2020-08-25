package d10_generic泛型;

public class DemoGenericInterface {

    public static void main(String[] args) {

        //实现方法1：实现过程指定String类型
        GenericInterfaceImpl1 impl1=new GenericInterfaceImpl1();
        impl1.method("hello");

        //实现方法2：创建对象指定Integer类型
        GenericInterfaceImpl2<Integer> impl2=new GenericInterfaceImpl2<>();
        impl2.method(9);
    }
}
