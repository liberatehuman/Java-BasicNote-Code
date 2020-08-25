package d21_interface_extendsmulti;

public interface MyInterfaceB {

    public abstract void abstractB();

    public abstract void abstractCommon(); //AB重复抽象方法


    public default void methodDefault(){
        System.out.println("BBB");
    } //AB重复默认方法
}
