package d26_innerClass;

/*
【匿名内部类】：省去了创建实现类/子类来实现接口/父类，直接覆写其抽象方法；【只使用唯一一次】

    接口名 对象名 = new 接口名(){
        @Override
        ...覆写所有接口抽象方法
    };

    （ new 是表示创建对象的动作； 接口名表示要实现的接口； {...}才是匿名内部类的内容 ）

【注】：
1、匿名内部类【创建对象】时，【只使用唯一一次】（若要多次使用且内容相同，只能另外创建匿名内部类/实现类）
2、匿名对象在【调用方法】时，【只调用唯一一次】（若一个对象使用多次方法，只能给对象起名）
3、匿名内部类省略了【实现/子类】；匿名对象省略了【对象名】
*/
public class AnonymousInner {

    public static void main(String[] args) {

        MyInterface objA = new MyInterface() { //整个{...}是一个匿名内部类，没名字，只用一次
            @Override
            public void methodAbs() {
                System.out.println("匿名内部类的【对象A】实现了接口");
            }

            @Override
            public void methodAbs2() {
                System.out.println("匿名内部类的【对象A】实现(2)了接口");
            }
        };

        objA.methodAbs();
        objA.methodAbs2();
        //==============================================================

        new MyInterface() { //匿名内部类没有对象名，故同时是【匿名对象】
            @Override
            public void methodAbs() {
                System.out.println("匿名内部类的【匿名对象】实现了接口");
            }

            @Override
            public void methodAbs2() {
                System.out.println("匿名内部类的【匿名对象】实现(2)了接口");
            }
        }.methodAbs(); //匿名对象没对象名，故【直接调用方法】

        new MyInterface() {
            @Override
            public void methodAbs() {
                System.out.println("匿名内部类的【匿名对象】实现了接口");
            }

            @Override
            public void methodAbs2() {
                System.out.println("匿名内部类的【匿名对象】实现(2)了接口");
            }
        }.methodAbs2(); //所以也就需要每次都写一遍，调用别的覆写方法

    }
}
