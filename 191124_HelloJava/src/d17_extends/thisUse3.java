package d17_extends;

/*
【this】关键字：访问【本类】的内容

【用法】：
 1、本类的成员方法，访问【本类】的成员变量

 2、本类的成员方法，访问【本类】另一个成员变量

 3、本类的构造方法，访问【本类】另一个构造方法

【注】：
    - this(...) 调用另一构造方法也必须是构造方法的【第一句】

    - this() 和 super() 不能同时使用，因为都必须是第一句，不然没法调用
*/
public class thisUse3 extends Fu {

    int num = 1;

    //构造方法之间调用
    public thisUse3() {
        this(8); //本类无参构造，调用另一个含参构造
        //super();  //this()和super()不同时使用
    }

    public thisUse3(int a) {
        //但是这个不能再调无参构造，循环调用，报错！
    }

    //调用成员变量
    public void show() {
        int num = 9;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    //成员方法之间调用
    public void methodA() {
        System.out.println("A");
    }

    public void methodB() {
        this.methodA(); //本类的成员方法，调用另一个成员方法
    }
}
