package d05_encapsulation封装;

public class PrivateUse {

    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        System.out.println("——————————————");

        person.name = "小明";
        person.setAge(-10); //间接访问，-10不合理
        person.show();
    }
}
