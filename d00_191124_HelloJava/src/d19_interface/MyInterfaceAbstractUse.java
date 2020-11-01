package d19_interface;
/*
【接口】使用步骤：
1、不能直接使用，必须通过【实现类】来实现   （类似抽象父类不可直接创建，必须通过【子类】创建）

实现类定义格式：
public class 实现类名 implements 接口名{
    ...
}

2、实现类必须覆写接口中【所有抽象方法】（类似子类必须覆写抽象父类所有抽象方法）
实现方法：去掉abstract关键字和；，加上{}

3、若实现类没有覆写接口所有抽象方法，那么这个实现类自己就是抽象类（因为保留了未覆写的抽象方法）
*/

public class MyInterfaceAbstractUse {

    public static void main(String[] args) {
        //不能 new 一个接口
        //MyInterfaceAbstract interface=new MyInterfaceAbcstract(); 错误！

        //创建接口的【实现类】来实现
        MyInterfaceAbstractImple implement = new MyInterfaceAbstractImple();

        implement.methodAbs1();
        implement.methodAbs2();
        implement.methodAbs3();
        implement.methodAbs4();
    }
}
