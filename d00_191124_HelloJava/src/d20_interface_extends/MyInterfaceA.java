package d20_interface_extends;

public interface MyInterfaceA {

    public abstract void methodAbstract();

    public default void methodDefault(){
        System.out.println("接口B的默认方法");
    }

    public static void methodA(){
        System.out.println("接口A的普通方法");
    }

}
