package d07_constructionMethod;

public class Singer {

    private String name;
    private int age;
    private boolean male;

    //间接访问姓名
    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    //间接访问年龄
    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    //间接访问性别
    public void setMale(boolean sex) { //boolean型的Setter方法规则照常
        male = sex;
    }

    public boolean isMale() {  //对于boolean型，其Getter方法一定要写成【isXxx】
        return male;
    }
}
