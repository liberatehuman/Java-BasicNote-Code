package d13_Set_HashSet;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    @Override //1.重写Object的equals方法（快捷键^+N ）
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);//当name age均相同，认为两个对象相同
    }

    @Override //2.重写Object的hashCode方法（快捷键^+N ）
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override//重写Object的toString方法，返回对象的属性
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
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
