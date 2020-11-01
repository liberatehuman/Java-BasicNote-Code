package d17_extends;

/*
【继承关系访问变量】

在父子类的继承关系中，若父类和子类的【成员变量重名】，创建子类对象时，访问重名变量有两种方式：

1、直接访问：【子类对象名.重名变量】

    等号左边（所创建的对象等号左边）是谁，就优先用谁的，没有则向上查找父类的

2、间接访问：通过【成员方法】

    方法属于谁，就优先用谁，没有则向上查找父类的
*/
public class extendsField_FuZi {

    public static void main(String[] args) {

        Fu fu = new Fu();
        System.out.println(fu.numFu);  //父类只可以用父类的变量
        //SystemDemo.out.println(fu.numZi);//父类不能使用子类的内容
        System.out.println("———————");

        Zi zi = new Zi();
        System.out.println(zi.numZi);  //子类既能使用自己的变量
        System.out.println(zi.numFu);  //子类也能使用父类的内容
        System.out.println("———————");

        //直接访问：【等号左边】是谁，就优先用谁的
        System.out.println(zi.num); //创建的对象左边是Zi类，优先
        System.out.println(fu.num); //创建的对象左边是Fu类
        //SystemDemo.out.println(zi.haha); //父子都没有的，编译报错
        System.out.println("———————");

        //间接访问：
        zi.methodZi(); //方法是子类的，优先调用子类的，没有则向上找
        zi.methodFu(); //方法是父类的，调用父类的
        //fu.methodZi(); //父类依旧不能访问子类方法
    }
}
