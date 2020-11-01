package d22_polymorphism多态;
/*
【多态】：在【继承/实现】前提下，一个对象拥有多种形态（子类is a父类）

 代码实现：父类引用，指向子类对象

 格式【左父右子】：
        父类/接口名 对象名 = new 子类/实现类名();

【访问成员变量/方法】（与继承完全相同）：
 1、多态关系访问【成员变量】，看【左边的对象】是谁，就用谁的（编译看左边，运行看左边）
 2、多态关系访问【成员方法】，看【右边new的】是谁，就用谁的（编译看左边，运行看右边）
*/

public class FuZiDemo {

    public static void main(String[] args) {

        Fu obj = new Zi(); //父类引用指向子类对象

        //（编译看左边，看.左边对象是否能访问成员变量/方法）

        //访问成员变量
        System.out.println(obj.num); //左边的对象是Fu类，就用Fu的
        obj.numPrint(); //new的是Zi类，就用Zi覆写的，没有就向上找

        //访问成员方法
        obj.method(); //和继承一样，重复方法看new的是谁，就用谁的方法
        obj.methodFu(); //和继承一样，Fu类的方法，Zi类没有，就向上找
    }
}
