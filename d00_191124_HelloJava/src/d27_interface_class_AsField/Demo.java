package d27_interface_class_AsField;

/*
 * 【类、接口作为成员变量】
 *
 *  java.lang.String也是一种类，自己定义的类/接口也是引用类型
 *
 * */
public class Demo {

    public static void main(String[] args) {

        Skill skill_1 = new Skill("施法"); //创建 类成员变量

        Weapon weapon_1 = new Weapon() { //创建 接口成员变量（为简便，使用匿名内部类）（实现类亦可）
            @Override
            public void attack() {
                System.out.println("攻击");
            }
        };

        Hero hero_1 = new Hero("马尔扎哈", skill_1, weapon_1);
        hero_1.action();

        //接口成员变量，进一步简化：setWeapon参数是Weapon类，直接在()内使用匿名对象匿名内部类实现接口
        hero_1.setWeapon(new Weapon() {
            @Override
            public void attack() {
                System.out.println("等~待~湮~灭~");
            }
        });
        hero_1.getWeapon().attack(); //同样，getWeapon返回的是Weapon类对象，再调用其方法
    }
}
