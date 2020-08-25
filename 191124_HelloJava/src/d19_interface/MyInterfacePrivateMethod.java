package d19_interface;

public interface MyInterfacePrivateMethod {

    public default void methodDefault1() {
        System.out.println("默认方法1");
        privateMethod1();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
        privateMethod1();
    }

    private void privateMethod1() { //普通私有方法
        System.out.println("调用：普通私有方法");
    }
    //=============================================================
    public static void methodStatic1() {
        System.out.println("静态方法1");
        privateMethod2();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        privateMethod2();
    }

    private static void privateMethod2() { //【静态】私有方法
        System.out.println("调用：静态私有方法");
    }
}
