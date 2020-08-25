package d03_Ex2_return_params;

public class Person {

    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }
}
