package d20_interface_extends;

public class Zi_Imple extends Fu implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodAbstract() {
        System.out.println("覆写：AB接口重复的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆写：AB接口重复的默认方法"); //必须覆写接口AB冲突的【默认方法】
    }


}
