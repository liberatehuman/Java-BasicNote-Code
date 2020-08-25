package d10_anonymous;

public class Person {

    String name;
    private int age;

    public void show() {
        System.out.println(name + "今年" + age + "岁");
    }

    public void setAge(int num) {
        if (num > 0 && num <= 100) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    public int getAge() { //对于Getter，不能有参数，返回值类型和成员变量对应
        return age;
    }
}
