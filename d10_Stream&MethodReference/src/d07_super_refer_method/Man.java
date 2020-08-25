package d07_super_refer_method;
/*
 * 【super 引用 父类方法】：
 *
 * 【前提】：
 *  1、【父类】是【已经存在的】（super 关键字存在）
 *
 *  2、【父类成员方法】也是【已经存在的】
 * */

public class Man extends Human {

    @Override
    public void sayHello() {
        System.out.println("Hi");
    }

    //定义参数为 Greetable 函数式接口的方法
    public static void method(Greetable greetable) {
        greetable.say();
    }

    //成员方法（用于调用父类方法）
    public void show() {

//        method(new Greetable() {
//            @Override
//            public void say() {
//                Human human = new Human();//创建父类对象
//                human.sayHello();//调用父类方法
//            }
//        });

        method(() -> super.sayHello());//有继承关系，可使用 super 关键字直接调用父类方法

        method(super::sayHello);//父类存在（super 存在），父类成员方法也存在，可引用
    }

    public static void main(String[] args) {
        new Man().show();//创建子类匿名对象，执行方法
    }

}
