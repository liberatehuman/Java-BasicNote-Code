package d17_extends;

public class Zi extends Fu {

    int numZi = 10;

    int num = 99;

    public void methodZi() {
        System.out.println(num); //子类自己有的方法，就用了，不用向上找
    }

    //区分局部变量、成员变量、父类成员变量【重名】
    public void varriableDiffer() {
        int num = 9;
        System.out.println("子类方法的局部变量num：" + num); //访问本方法的局部变量
        System.out.println("子类的重名成员变量num：" + this.num); //访问本子类的重名成员变量
        System.out.println("父类的重名成员变量num：" + super.num); //访问父类的重名成员变量
    }

    public void method() {
        System.out.println("子类重名方法执行");
    }
}
