package d23_USBDemo_interface_polym;

import java.util.Scanner;

public class Computer {

    public void powerOn() {
        System.out.println("电脑：开");
    }

    public void powerOff() {
        System.out.println("电脑：关");
    }

    //Computer类，使用"实现USB接口"的设备
    public void useDevice(USB usb) { //参数是遵守USB规范的设备，不管是什么设备

        usb.deviceOn(); //无论是什么设备，先打开

        //向下转型判断具体是哪个设备
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            Scanner sc = new Scanner(System.in);
            keyboard.type();
            sc.next();
        }

        usb.deviceOff(); //无论是什么设备，关闭
    }
}
