package d22_polymorphism多态;

public class Zi extends Fu {

    int num=10;

    @Override
    public void numPrint() {
        System.out.println(num);
    }


    @Override
    public void method() {
        System.out.println("子类方法");
    }


}
