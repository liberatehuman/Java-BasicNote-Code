package d17_extends;

public class PhoneDemo {

    public static void main(String[] args) {
        //原版手机功能
        Phone phone1=new Phone();
        phone1.call();
        phone1.send();
        phone1.show();
        System.out.println("————————————");

        //新版手机功能
        PhoneNew phone2=new PhoneNew();
        phone2.call();
        phone2.send();
        phone2.show(); //添加了自己新的内容，且不改变父类
    }
}
