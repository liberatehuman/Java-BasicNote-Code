package d01_FunctionalInterface;
/*
 * 【函数式接口的使用】：
 *          一般可作为方法的【参数】或【返回值类型】使用
 * */

public class Demo {

    public static void main(String[] args) {

        //1.参数是接口，传递实现类对象
        show(new MyfunctionalInterfaceImpl());

        //2.参数是接口，传递接口匿名内部类
        show(new MyfunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写");
            }
        });

        //3.参数是接口，传递接口 Lambda 简化匿名内部类
        show(() -> System.out.println("匿名内部类重写（Lambda）"));
    }

    //定义参数传递接口的方法
    public static void show(MyfunctionalInterface functionalInterface) {
        functionalInterface.method();
    }

}
