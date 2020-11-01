package d01_equals_Object_Objects;
/*
 *【java.util.Objects 工具类】：包含一些静态实用方法，这些方法都是【null-tolerant/safe】的
 *
 *      其 equals 方法是【null-tolerant/safe】的，不会抛出 NullPointException
 */

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    @Override
    // 两个引用类型对象的地址肯定不同，比较的意义不大

    // 所以重写equals方法：比较两个对象的属性是否相同
    public boolean equals(Object obj) {
        if (obj == this) {  //传参是本身，直接返回true，提高程序运行效率
            return true;
        }
        if (obj == null) {  //传参是null，false，提高程序运行效率，防NullPointException
            return false;
        }
        if (obj instanceof Person) {    //传参是Person类，便可比较两个对象的属性了
            boolean b = this.name == ((Person) obj).name &&
                    this.age == ((Person) obj).age;
            /*
            Object 最高父类没有 name 和 age 变量，也不会向下寻找（只有子类向上找父类），
            需要【向下转型（强转）】为Person类，再调用
            */
            return b;
        }
        return false;
    }

//    @Override  //也可以直接Generate equals()的重写
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) //反射技术，判断o是否为Person类
//            return false;
//        Person person = (Person) o;
//        return age == person.age &&
//                Objects.equals(name, person.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    } //Objects


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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
