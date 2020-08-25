package d19_interface;
/*
【接口私有方法】：接口中设一个共用方法可被重复使用，只供【接口内方法】使用，而实现类无权使用
    -解决方案：Java9+，允许定义私有方法

1、普通私有方法：给多个【默认方法】重复使用
格式：
private 返回值类型 方法名(参数列表){
    ...
}

2、静态私有方法：给多个【静态方法】重复使用
格式：
private static 返回值类型 方法名(参数列表){
    ...
}
*/
public class MyInterfacePrivateUse {

    public static void main(String[] args) {
        //普通私有方法
        MyInterfacePrivateMethod privateImple = new MyInterfacePrivateImple();//先创建实现类对象
        privateImple.methodDefault1(); //实现类调用默认方法1，OK
        privateImple.methodDefault2(); //实现类调用默认方法2，OK

        System.out.println("——————————————————");

        //静态私有方法（静态直接" 实现类名.方法名()" ）
        MyInterfacePrivateMethod.methodStatic1(); //接口调用静态方法1，OK
        MyInterfacePrivateMethod.methodStatic2(); //接口调用静态方法2，OK
    }
}
