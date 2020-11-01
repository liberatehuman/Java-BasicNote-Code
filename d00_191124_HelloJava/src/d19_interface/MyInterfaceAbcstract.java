package d19_interface;
/*
【接口】：多个类的公共规范（引用数据类型）

接口最重要的，是其中的【抽象方法】

定义格式：
    public interface 接口名{
        //接口内容（Java 9+：可包含常量、抽象方法、默认方法、静态方法、私有方法）
    }

【注】：
1、接口中的抽象方法，修饰符必须为【public abstract】
    两个修饰符可选择性省略，也可都省（暂不推荐）
2、接口中的抽象方法，方法的三要素可自由定义
*/

public interface MyInterfaceAbcstract {
//虽然关键字class --> interface，但编译生成的字节码文件依然是.java --> 【.class】

    //【抽象方法】
    public abstract void methodAbs1(); //灰色表示可省略

    public void methodAbs2(); // OK

    abstract void methodAbs3();  //OK

    void methodAbs4();  //OK
}
