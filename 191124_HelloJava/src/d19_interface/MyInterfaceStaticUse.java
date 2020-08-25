package d19_interface;
/*
【接口静态方法】：
public static 返回值类型 方法名(参数列表){
    ...
}

【注】：不能用接口的实现类来调用接口静态方法！
      直接" 接口名.静态方法名(参数列表); "
*/

public class MyInterfaceStaticUse {

    public static void main(String[] args) {

        //不能用实现类调用静态方法！
        //MyInterfaceStatic imple = new MyInterfaceStatic();
        //imple.staticMethod();  错误！静态方法与类无关

        //直接接口名.静态方法名()，与类无关
        MyInterfaceStaticMethod.staticMethod();
    }
}
