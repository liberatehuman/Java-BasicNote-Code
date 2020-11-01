package d04_Class;

/*
【对象类型作为方法的参数】
*/

public class StudentParam {

    public static void main(String[] args) {
        Student std = new Student();
        std.name = "宝贝";
        std.age = 20;

        method(std); //传递进去的参数其实是对象std的地址值
    }

    public static void method(Student param) {
        System.out.println(param.name); //可直接用参数内的对象名.成员方法
        System.out.println(param.age);
    }
}
