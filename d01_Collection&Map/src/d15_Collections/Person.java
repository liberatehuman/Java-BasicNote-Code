package d15_Collections;

/*
 *  1、java.util.Collections源码中的【泛型方法 sort】：
 *
 *      public static <T extends Comparable<? super T>> void sort(List<T> list)
 *
 *  2、集合要想实现排序，其元素类需要实现【Comparable 接口】，并重写其抽象方法【compareTo】：
 *
  *     public int compareTo(T o);
 *
 * */
public class Person implements Comparable<Person> {

    private String name;
    private int age;

    //【重写 Comparable 的 compareTo 方法】
    @Override
    public int compareTo(Person o) {
        //return 0;//默认返回0，认为参数是相同的，按存储顺序来

        //按 age 大小排序：
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

}
