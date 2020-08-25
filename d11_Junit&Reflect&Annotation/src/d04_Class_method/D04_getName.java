package d04_Class_method;
/*
 * 【获取 Class 对象的类名】：
 *
 *          String getName()
 * */

public class D04_getName {

    public static void main(String[] args) {
        //获取 Class 对象
        Class<Person> personClass = Person.class;

        String className = personClass.getName();
        System.out.println(className);
    }
}
