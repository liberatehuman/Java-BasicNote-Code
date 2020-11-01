package d20_interface_extends;
/*
【继承父类 & 实现多接口】：
public class 子类名(实现类名) extends 父类名 implements 接口名1,接口名2,...{
    //覆写所有抽象方法
    ...
}

【注】：
1、接口没有【构造方法】和【静态代码块】

2、一个类仅【1个】直接父类，但是可以同时实现【多个】接口

3、若实现的多个接口中，有【重复的抽象方法】，只需覆写其中一个即可

4、若实现的多个接口中，有【重复的默认方法】，必须对【冲突的】默认方法进行覆写

5、直接父类和接口的方法重复(冲突)时，【优先父类】

6、若没有覆写所有抽象方法，这个类本身就是抽象类
*/
public class Demo {

    public static void main(String[] args) {

        Zi_Imple zi_imple=new Zi_Imple();

        zi_imple.methodAbstract();//调用接口AB冲突的抽象方法，只需覆写其中一个

        zi_imple.methodDefault();//接口AB冲突的【默认方法】，【必须覆写】

        zi_imple.methodA();//父类和接口A方法冲突，优先父类

    }
}
