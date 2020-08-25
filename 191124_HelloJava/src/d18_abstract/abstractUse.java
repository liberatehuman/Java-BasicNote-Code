package d18_abstract;

/*
【注1】：
1、抽象类（父类）不能直接new创建对象

2、必须有子类【继承】抽象类，子类可以new

3、子类必须【覆写】抽象类中【所有抽象方法】（去掉abstract，补上{}）

4、通过创建子类对象，进行使用

【注2】：
1、抽象类可以有构造方法，是供子类创建对象时，初始化父类成员使用的

    -子类构造方法有默认super()方法，用于访问父类构造方法

2、抽象类【不一定】有抽象方法；抽象方法【必须】是抽象类的

    -不包含抽象方法的抽象类，有特殊使用场景，如：设计模式中的【适配器模式】
*/
public class abstractUse {

    public static void main(String[] args) {

        //Animal animal = new Animal(); //错误！抽象类不能new

        //MeatAnimal meatanimal = new MeatAnimal(); //错误！继承抽象类的抽象子类照样不能new

        Wolf wolf = new Wolf();

        wolf.eat();
        wolf.shout(); //子类必须【覆写】抽象类中【所有抽象方法】
    }
}
