package d14_static;
/*
【静态代码块】

【特点】：
 1、当【第一次】使用本类时，静态代码块执行【唯一】的一次

 2、静态内容总是优先于非静态，故静态代码块(static)比构造方法(public)先执行
*/

public class staticBlock {

    public static void main(String[] args) {

        StudenStaticBlock stu1 = new StudenStaticBlock(); //第一次使用本类，静态代码块执行唯一的一次
        //且静态代码块比构造方法先执行
        StudenStaticBlock stu2 = new StudenStaticBlock(); //再次使用本类，静态代码块不再执行
    }
}
