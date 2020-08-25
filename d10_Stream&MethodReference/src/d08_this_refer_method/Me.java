package d08_this_refer_method;
/*
 * 【this 引用 本类方法】：
 *
 * 【前提】：
 *  1、【本类】是【已经存在的】（this 关键字存在）
 *
 *  2、【本类成员方法】也是【已经存在的】
 * */

public class Me {

    public static void method(Rich rich) {
        rich.buy();
    }

    public void buyMansion() {//（this 代表当前类【对象】，若用static修饰，则无法被 this 调用）
        System.out.println("豪宅get");
    }

    public void happy() {
        method(() -> this.buyMansion());//【不要用匿名实现接口】，否则 this 调用的只能是接口方法，Lambda 才行

        method(this::buyMansion);//本类存在，本类成员方法存在，可引用
    }

    public static void main(String[] args) {
        new Me().happy();//创建本类匿名对象执行方法
    }
}
