package d04_Class;

/*
【局部变量】VS【成员变量】

1、定义的位置不同：
局部变量：在方法内部
成员变量：在类的内部，方法的外部

2、作用域不同：
局部变量：只有方法内可以使用，除了方法就不能用
成员变量：整个类都可通用

3、默认值不同：
局部变量：无默认值【若要使用，必须先手动赋值】【一般变量必须先赋值才可使用】
成员变量：就算未赋值，会自带默认值。规则同数组

4、内存位置不同：
局部变量：在栈内
成员变量：在堆里

5、生命周期不同：
局部变量：随方法的进栈而诞生，随方法的出栈而消失（一般情况比较短）
成员变量：随对象的创建而诞生，随对象被垃圾回收而消失（相对较长）
*/

public class VarriableDifference {

    public static void methodA() {
        int num;
        //SystemDemo.out.println(num); 错误，局部变量未赋值不可使用
        //SystemDemo.out.println(protected_b); 错误，b是methodB作用域的局部变量，超出范围不能用
    }

    public static void methodB() {
        int b = 10;
        System.out.println(b);
    }

}
