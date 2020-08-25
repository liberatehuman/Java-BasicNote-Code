package d22_polymorphism多态;
/*
【instanceof】：向下转型一定要进行instanceof判断，防止类转换异常

格式：对象名 instanceof 类名

得到的是boolean类型，即判断前面对象能否被当做后面类的实例
*/

public class Demo_instanceof {

    public static void main(String[] args) {
        Animal animal_1 = new Cat();
        System.out.println(animal_1 instanceof Cat); //得到的是boolean值

        Animal animal_2 = new Dog();
        givePet(animal_2);
    }

    public static void givePet(Animal animal) {
        if (animal instanceof Cat) { //判断对象是否为Cat类
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        if (animal instanceof Dog) { //判断对象是否为Dog类
            Dog dog = (Dog) animal;
            dog.protect();
        }
    }
}
