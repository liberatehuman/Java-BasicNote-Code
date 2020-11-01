package d24_final;
/*
final修饰【局部变量】：

1、修饰基本类型，不可变的是【数据值】
2、修饰引用类型，不可变的是【地址值】
*/

public class final_localVarriable {

    public static void main(String[] args) {
        //1.修饰基本类型
        final int num = 10;
        //num = 20;  错误！
        //num = 10;  哪怕改变的值一样，依然错误！
        System.out.println(num);

        final int a; //间接赋值
        a=5; //OK只要【赋值】一次，就不可改变
        System.out.println(a);

        //2.修饰引用类型
        final Person p1=new Person("娜扎");
        System.out.println(p1);

        p1.setName("娜扎宝贝"); //引用类型的【内容】可变
        System.out.println(p1); //【地址值】不会变

    }

}
