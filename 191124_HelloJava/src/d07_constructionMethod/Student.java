package d07_constructionMethod;

/*
【构造方法】：专门用来创建对象的方法
当我们通过new关键字创建对象时，其实就是在调用构造方法

格式：
public 类名(){ 方法体 }

【注】：
1、构造方法的名称必须和类的名称完全一致，包括大小写
2、构造方法无返回值类型，连void都不要
3、构造方法不能return一个具体的返回值
4、若没有编写构造方法，在new的时候编译器会默认赠送一个构造方法（无参，无方法体，啥也不干）
public Xxx(){}
5、一旦自己编写了至少一个构造方法，编译器将不再赠送
6、构造方法可以重载（方法名相同，参数不同）
*/
public class Student {
    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public Student() {
        System.out.println("无参构造方法生效");
    }

    //全参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("全参构造方法生效");
    }

    //Getter Setter方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
