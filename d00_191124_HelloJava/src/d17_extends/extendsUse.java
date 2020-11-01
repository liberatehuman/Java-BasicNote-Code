package d17_extends;
/*
【继承】：共性抽取

        - 在继承关系中，"子类就是一个父类"，即子类可以被当做父类看待。 关系：【is-a】
        （如父类：员工，子类：教师，"教师就是一个员工"）

1、定义父类（就一个普通的类）：
        public class 父类名 {
           ...
        }

2、定义子类：
        public class 子类名 extends 父类名 {
           ...
        }
*/
public class extendsUse {

    public static void main(String[] args) {
        //创建Employee的子类对象1：
        Teacher teacher = new Teacher();
        teacher.method();

        //创建Employee的子类对象2：
        Assistant assistant = new Assistant();
        teacher.method();
    }
}
