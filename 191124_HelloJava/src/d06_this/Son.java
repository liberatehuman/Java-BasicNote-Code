package d06_this;

/*
【局部变量和成员变量重名】：按【就近原则】，优先用局部变量

若要访问本类中的成员变量：this.成员变量名

    - 调用哪个对象的方法，谁就是this

*/

public class Son {

    String name;

    public void sayHello(String name) {
        System.out.println(name + "你好，我是" + name);//按"就近原则"，优先取局部变量
        System.out.println(this.name + "你好，我是" + name);
    }

}
