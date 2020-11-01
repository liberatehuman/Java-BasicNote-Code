package d19_interface;
/*
 【默认方法】：解决【接口升级】的问题（接口【新添加】方法，想直接被实现类使用）

  定义格式：
        public default 返回值类型 默认方法名() {
            ...
        }

 【注】：
  1、接口的默认方法，可通过接口实现类创建对象，【直接】调用

  2、接口的默认方法，可以被实现类进行【覆写】
*/
public class MyInterfaceDefaultUse {

    public static void main(String[] args) {

        MyInterfaceDefaultImpleA a = new MyInterfaceDefaultImpleA();
        a.method(); //类似继承关系访问方法/变量，创建的对象是谁，就调用谁的方法
        a.methodDefault();

        MyInterfaceDefaultImpleB b = new MyInterfaceDefaultImpleB();
        b.method();
        b.methodDefault(); //实现类可以覆写默认方法
    }
}
