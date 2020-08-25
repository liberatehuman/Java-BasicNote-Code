package d25_authority.AnotherPackage;
/*
【不同包，非子类】：只可访问public
*/
import d25_authority.MyClass;

public class AnotherPack_Class {

    public void method4(){

        System.out.println(new MyClass().public_a); //public  O
    }
}
