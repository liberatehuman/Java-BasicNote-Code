package d17_extends;
/*
【父子类的成员方法重名】
看【右边new】的是谁，就优先用谁的，没有则向上找

【总结】：无论是成员变量还是成员方法，如果没有都是向上找父类，不会父类向下找
*/
public class MethodDifference {

    public static void main(String[] args) {

        Zi zi=new Zi();

        zi.methodZi(); //子类正常使用自己的方法
        zi.methodFu(); //子类正常使用父类的方法

        zi.method(); //new的是子类，优先用子类的
    }
}
