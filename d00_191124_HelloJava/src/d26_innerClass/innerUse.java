package d26_innerClass;

/*
【内部类】：一个类的内部包含($)另一个类（have-a），如身体$心脏

【分类】：
1、成员内部类

修饰符 class 外部类名{
    修饰符 class 内部类名{ ... }
    ...
}
【注】：内用外，随意；外用内，需要外部类对象

【使用方式】：
a.间接：在外部类方法中使用内部类，然后main只调用外部类方法
b.直接：创建内部类对象，再直接用--【 外部类名.内部类名 对象名 = new 外部类名().new 内部类名(); 】
======================================================================
2、局部内部类（包括匿名内部类）
仅该方法内部可以使用，出了方法失效

修饰符 class 外部类名{
    修饰符 返回值类型 成员方法名(参){
        修饰符 class 内部类名{ ... }
    }
}
======================================================================
【权限修饰符小结】：
1、外部类：public/(default)
2、成员内部类：都行
3、局部内部类：(无权限)
*/
public class innerUse {

    public static void main(String[] args) {

        //1.成员内部类
        //间接使用
        MemberInner body = new MemberInner();
        body.move();
        System.out.println("————————————");
        //直接使用
        MemberInner.Heart heart = new MemberInner().new Heart();
        heart.beat();
        System.out.println("————————————");

        //2.局部变量类
        LocalInner localInner = new LocalInner();
        localInner.method(); //调用包含局部内部类的方法，使用局部内部类的方法
    }

}
