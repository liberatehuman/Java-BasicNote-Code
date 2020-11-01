package d21_interface_extendsmulti;

public class MyInterfaceImpleC implements MyInterfaceC {

    //接口C包含了接口A和B各自专有抽象方法，以及共有方法
    //实现类实现接口C：相当于要覆写C、以及其父接口A、B的所有抽象方法（共4个）
    @Override
    public void abstractC() {

    }

    @Override
    public void abstractA() {

    }

    @Override
    public void abstractB() {

    }

    @Override
    public void abstractCommon() {

    }
}
