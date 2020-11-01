package d17_extends;

/*
【继承中的构造】
1、子类构造方法默认隐含有一个"super();"，所以一定是先调用父类【无参】构造方法，后执行子类构造方法

2、子类构造可用super(...)关键字调用父类的【重载】构造

3、super调用父类构造，必须是第一个子类构造的【第一句】（不能多个super，哪怕是调用不同的父类构造）

【总结】：子类一定会调用父类的构造方法，不写会默认赠送super()调用父类无参构造。super仅一个且必须第一个
*/
public class Constructer {

    public static void main(String[] args) {

        Zi2 zi = new Zi2();

    }
}

