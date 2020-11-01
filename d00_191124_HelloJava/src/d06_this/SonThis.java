package d06_this;

public class SonThis {

    public static void main(String[] args) {

        Son son = new Son();

        son.name = "儿子";

        son.sayHello("爸爸"); //sayHello是调用son的方法，this.name是son类内成员变量
    }
}
