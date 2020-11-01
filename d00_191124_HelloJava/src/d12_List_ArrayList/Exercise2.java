package d12_List_ArrayList;

//定义一个由4个对象类型组成的ArrayList集合，并遍历

import java.util.ArrayList;

public class Exercise2 {

    public static void main(String[] args) {

        Student stu1=new Student("刘德华",111);
        Student stu2=new Student("郭富城",222);
        Student stu3=new Student("黎明",333);
        Student stu4=new Student("张学友",444);

        ArrayList<Student> list=new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        System.out.println(list); //泛型是对象类型，保存的是地址值
        System.out.println("——————————————————————————");

        //遍历
        for (int i = 0; i < 4; i++) {
            System.out.println("姓名："+list.get(i).getName()+"，学号："+list.get(i).getID());
        }
        //先list.get找到对应集合的位置(地址值)，再.getXxx取成员变量值
    }
}
