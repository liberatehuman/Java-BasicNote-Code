package d18_abstract;

public class Wolf extends Animal {

    public Wolf() {
        super();
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("狼吃肉");
    }

    @Override  //子类必须覆写【所有】抽象父类的抽象方法
    public void shout() {
        System.out.println("嗷呜~~");
    }
}
