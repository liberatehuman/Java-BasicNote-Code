package d19_interface;

public class MyInterfaceDefaultImpleB implements MyInterfaceDefaultMethod{
    @Override
    public void method() {
        System.out.println("B对普通接口方法覆写完毕");
    }

    @Override
    public void methodDefault() {
        System.out.println("B对默认方法覆写完毕");
    }
}
