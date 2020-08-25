package d18_abstract;

/*
【抽象方法】：权限修饰符后加上 abstract，并【无方法区{}】

【抽象类】：抽象方法所在的类必须为抽象类，在 class 前加上abstract
*/
public abstract class Animal {

    public Animal() {
        System.out.println("抽象父类构造方法执行");
    }

    public abstract void eat(); //不同动物吃什么，不确定

    public abstract void shout();

}
