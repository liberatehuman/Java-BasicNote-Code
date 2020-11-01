package d07_constructionMethod;

public class StudentConstructureUse {

    public static void main(String[] args) {

        Student std1 = new Student(); //无参构造
        System.out.println("————————————————");

        Student std2 = new Student("刘德华", 50);//全参构造
        System.out.println(std2.getName() + "," + std2.getAge() + "岁");

        //全参构造并不代表Setter方法失去意义。当需要修改成员变量数据内容时，仍需要setXxx方法
        std2.setAge(55);
        System.out.println(std2.getName() + "," + std2.getAge() + "岁");
    }
}
