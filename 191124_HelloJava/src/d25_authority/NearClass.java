package d25_authority;
/*
【同一个包】：可访问public、protected、(default)
*/
public class NearClass {

    public void method2(){
        System.out.println(new MyClass().public_a);    //public     O
        System.out.println(new MyClass().protected_b); //protected  O
        System.out.println(new MyClass().default_c);   //(default)  O
    }
}
