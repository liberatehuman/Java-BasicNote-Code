package d21_interface_extendsmulti;

public interface MyInterfaceA {

    public abstract void abstractA();

    public abstract void abstractCommon(); //AB重复方法


    public default void methodDefault(){
        System.out.println("AAA");
    } //AB重复默认方法
}
