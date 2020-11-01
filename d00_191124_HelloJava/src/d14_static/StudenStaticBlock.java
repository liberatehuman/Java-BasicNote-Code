package d14_static;
/*
【静态代码块】：用于一次性地声明类中静态变量

格式：
    static {
        //静态变量声明内容
    }
*/

public class StudenStaticBlock {

    static {
        System.out.println("静态代码块执行");
        String region;
        String school;
    }

    public StudenStaticBlock() {
        System.out.println("构造方法执行");
    }
}
