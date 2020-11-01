package d17_extends;

public class PhoneNew extends Phone{

    //可以在继承后，直接将方法名输入+回车自动覆写
    // 加了Override可以检查是否正确覆写
    @java.lang.Override
    public void call() {
        super.call(); //直接调用父类方法
    }

    @java.lang.Override
    public void send() {
        super.send();
    }

    @java.lang.Override
    public void show() {
        super.show(); //直接调用父类方法

        //自己添加新的内容，且不影响父类
        System.out.println("显示来电姓名");
        System.out.println("显示来电头像");
    }
}
