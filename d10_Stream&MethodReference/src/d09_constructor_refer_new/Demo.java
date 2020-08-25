package d09_constructor_refer_new;
/*
 * 【构造器（构造方法） 引用 new 】：要创建的对象类型已知，通过引用 new 进行创建
 *
 * 【前提】：
 *  1、【构造方法】是【已经存在的】（public Person(String name)）
 *
 *  2、【创建对象方式】也是【已经存在的】（new）
 * */

public class Demo {

    public static void method(String name, PersonBuilder personBuilder) {
        Person person = personBuilder.buildPerson(name);
        System.out.println(person.getName());
    }


    public static void main(String[] args) {
        method("小明", (String name) -> {
            return new Person(name);
        });

        method("小明",Person::new);//构造方法Person(String name)已知，创建对象方式 new 存在，可引用
    }
}
