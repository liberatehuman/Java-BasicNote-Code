package d22_polymorphism多态;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void protect(){
        System.out.println("狗看家");
    }
}
