package d19_interface;

public interface MyInterfaceDefaultMethod {
    //普通抽象方法
    public abstract void method();

    //新添加的默认方法
    public default void methodDefault() {
        System.out.println("新添加的接口默认方法执行");
    }

}
