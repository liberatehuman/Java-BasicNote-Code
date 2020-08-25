package d23_USBDemo_interface_polym;

//键盘类，实现USB接口
public class Keyboard implements USB {
    @Override
    public void deviceOn() {
        System.out.println("键盘：开");
    }

    @Override
    public void deviceOff() {
        System.out.println("键盘：关");
    }

    public void type(){
        System.out.print("请输入：");
    }
}
