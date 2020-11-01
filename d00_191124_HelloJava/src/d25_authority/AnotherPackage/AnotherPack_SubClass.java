package d25_authority.AnotherPackage;
/*
【不同包，子类】：可访问public，protected
*/
import d25_authority.MyClass;

public class AnotherPack_SubClass extends MyClass {

    public void method3(){
        System.out.println(super.public_a); //public     O
        System.out.println(super.protected_b); //protected  O

        //SystemDemo.out.println(new MyClass().protected_b);  为什么报错？？？

        //若子类与父类不在同一包中，子类实例可以访问其从父类【继承】而来的protected方法
        //，而不能访问父类【实例】的protected方法。
    }
}
