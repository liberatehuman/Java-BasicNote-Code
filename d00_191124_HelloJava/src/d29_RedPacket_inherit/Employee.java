package d29_RedPacket_inherit;

//员工类
public class Employee {

    private String name;
    private int money;

    public Employee() {
    }

    public Employee(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //查看当前身份余额
    public void show() {
        System.out.println("我是：" + name + "，有：" + money + "¥");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
