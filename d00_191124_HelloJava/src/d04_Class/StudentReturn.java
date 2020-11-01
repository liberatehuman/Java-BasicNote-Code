package d04_Class;

public class StudentReturn {

    public static void main(String[] args) {
        Student std = method(); //用一个std对象接受方法的返回值(对象地址值)
        System.out.println(std.name);
        System.out.println(std.age);
    }

    public static Student method() { //返回值类型是Student类
        Student one = new Student();
        one.name = "小明";
        one.age = 22;
        return one; //返回的值其实是对象的地址值
    }
}
