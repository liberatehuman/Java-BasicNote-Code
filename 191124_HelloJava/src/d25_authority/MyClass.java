package d25_authority;

/*
                         public  >   protected   >   (default)   >   private

同一个类     （我自己）        O            O               O              O

同一个包     （同室老婆）      O            O               O

不同包，子类 （儿子在他房间）   O            O

不同包，非子类（客人）         O
*/
public class MyClass {

    public int public_a = 4;
    protected int protected_b = 3;
    int default_c = 2;
    private int private_d = 1;

    public void method1() {
        System.out.println(private_d); //private修饰的，只有本类可以
    }
}
