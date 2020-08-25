package d19_interface;

public class MyInterfacePrivateImple implements MyInterfacePrivateMethod{

    public void methodImple(){

        //privateMethod1(); 错误！实现类不能访问普通【私有】方法

        //MyInterfacePrivateMethod.privateMethod2(); 错误！实现类不能访问静态【私有】方法
    }
}
