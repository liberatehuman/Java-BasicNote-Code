package d23_USBDemo_interface_polym;

public class Main {

    public static void main(String[] args) {

        Computer pc = new Computer();
        pc.powerOn();
        System.out.println("...............");

        //1、创建鼠标：采用【向上转型】为USB类
        USB usbMouse = new Mouse(); //多态写法

        pc.useDevice(usbMouse); //把鼠标当做USB类使用
        System.out.println("...............");

        //2、创建键盘
        Keyboard keyboard = new Keyboard();

        pc.useDevice(keyboard); //正确！参数虽然不是USB类，但也发生了【向上转型】（小范围-->大范围）
        /*这就好比：
        public void method(double public_a) { sout(num); }
        method(10); //int --> double，打印结果是【10.0】，发生了自动转换*/

        //pc.useDevice(new keyboard); //同样地，采用匿名对象作为参数也可
        System.out.println("...............");

        pc.powerOff();
    }
}
