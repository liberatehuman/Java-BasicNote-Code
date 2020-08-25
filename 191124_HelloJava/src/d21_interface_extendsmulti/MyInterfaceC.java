package d21_interface_extendsmulti;
/*
【接口多继承】：
1、类与类是【单继承】，直接父类仅1个
2、类与接口是【多实现】，一个类可以实现多个接口
3、接口与接口是【多继承】

【注】：
1、多个父接口的抽象方法重复，没关系
2、多个父接口的默认方法重复，【必须覆写】重复的默认方法，且【default关键字不可省】
  （默认方法有具体方法体，爸妈同时让你做两件事，办不到啊！必须覆写，作出决定）
*/
public interface MyInterfaceC extends MyInterfaceA, MyInterfaceB {
//接口C【继承】了接口A和接口B
//接口C包含接口A和B各自专有抽象方法，以及共有方法

    public abstract void abstractC(); //C自己的抽象方法


    @Override
    public default void methodDefault() {
        //必须覆写多父接口的重复【默认方法】，且【default不可省】
    }
}
