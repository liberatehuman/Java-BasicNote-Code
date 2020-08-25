package d14_static;
/*
 【static】：修饰成员属性（"静态变量"），属于类，而不属于对象（静态的优先于对象）

    静态变量直接调用：类名.变量名
*/
public class staticField {

    public static void main(String[] args) {

        Student stu1 = new Student("小明");
        stu1.room = "A101";
        Student stu2 = new Student("小红");

        System.out.println("学号：" + stu1.getID()
                + " 姓名：" + stu1.getName()
                + " 教室：" + stu1.room);
        System.out.println("学号：" + stu2.getID()
                + " 姓名：" + stu2.getName()
                + " 教室：" + stu2.room);//room是static修饰的，stu1的room也是大家的room
    }
}
