package d14_static;

public class myMethod {

    int num;
    static int staticNum;

    //成员方法
    public void method() {
        System.out.println("普通成员方法");

        System.out.println(num); //成员方法可直接访问非静态

        System.out.println(staticNum); //成员方法也可访问静态
    }

    //静态方法
    public static void staticMethod() {
        System.out.println("静态方法");

        //System.out.println(num);  错误！静态方法不能直接访问非静态【重点】

        System.out.println(staticNum);

        //System.out.println(this); 错误！静态方法不能使用this关键字
        // （因为this代表当前对象，通过谁调用的的方法，谁就是当前对象。而static与对象无关）
    }
}
