package d27_interface_class_AsField;

public class Hero {

    private String name;
    private Skill skill; //自定义的Skill类，可以作为成员变量类型
    private Weapon weapon; //自定义的接口，也可以作为成员变量类型

    public void action() {
        System.out.print(name + "：使用-"+skill.getSkil()+"-"); //注意自己定义的类型具体里面的返回值
        weapon.attack(); //注意这是方法，返回值void，不能放在上面一起打印
    }

    public Hero() {
    }

    public Hero(String name, Skill skill, Weapon weapon) {
        this.name = name;
        this.skill = skill;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
