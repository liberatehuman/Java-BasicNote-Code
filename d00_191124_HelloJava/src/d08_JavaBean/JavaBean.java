package d08_JavaBean;

/*
【标准类】通常需要包含4个部分：
1、所有成员变量都用private关键字修饰
2、为每个成员变量编写一对Getter/Setter方法
3、编写一个无参的构造方法
4、编写一个全参的构造方法

这样的一个标准类也叫做【Java Bean】
*/

public class JavaBean {

    //成员变量需自行手动编写
    private String name;
    private int age;

    //其余全用菜单栏：Code——Generate生成Getter/Setter、无参、全参构造方法（Ctrl+N）
    public JavaBean() {
    }

    public JavaBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
