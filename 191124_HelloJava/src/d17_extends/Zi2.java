package d17_extends;

public class Zi2 extends Fu2 {

    public Zi2() {
        //super(); //默认隐含的调用父类【无参】构造方法
        super(6); //调用父类【重载】构造方法
        System.out.println("子类构造方法执行");
    }

    public void method() {
        //super();  错误！只有子类构造方法，才能调用父类构造方法
    }
}
