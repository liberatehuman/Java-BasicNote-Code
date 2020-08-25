package d23_USBDemo_interface_polym;

//鼠标类，实现USB接口
public class Mouse implements USB {
    @Override
    public void deviceOn() {
        System.out.println("鼠标：开");
    }

    @Override
    public void deviceOff() {
        System.out.println("鼠标：关");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
