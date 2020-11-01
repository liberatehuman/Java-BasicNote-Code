package d14_static;
/*
【static】修饰成员方法（"静态方法"），属于类，而不是对象

        静态方法直接调用：类名.方法名()

【注】：
 1、静态方法不能直接访问非静态变量（因为内存中【先】有静态内容，【后】有非静态内容）

    - "先人不知道后人，而后人知道先人"

 2、静态方法中不能用this（因为this代表当前对象，通过谁调用的的方法，谁就是当前对象。而static与对象无关）
*/

public class staticMethod {

    public static void main(String[] args) {
        myMethod method = new myMethod(); //普通的成员方法必须先创建对象，才能使用
        method.method();

        method.staticMethod(); //静态方法也可以对象名.方法名，不推荐；编译后javac仍会翻译为"类名.方法名"
        myMethod.staticMethod(); //静态方法直接"类名.方法名"使用，推荐

        outmethod(); //自定义的方法可直接用
        staticMethod.outmethod(); //也可以类名.方法名，和上面完全等价
    }

    public static void outmethod() {
        System.out.println("自己的方法");
    }

}
