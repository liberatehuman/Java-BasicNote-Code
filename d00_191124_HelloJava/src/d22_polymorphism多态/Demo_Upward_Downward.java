package d22_polymorphism多态;

/*
【对象向上转型】：子类被当做父类使用（必定安全）

格式（就是多态）：
父类名 对象名 = new 子类名;

【缺点】：一旦向上转型后，就无法再使用子类原本特有方法

========================================================
【对象向下转型】：父类【还原】成本来的子类对象（可能报错）

格式：
子类名 对象名 = (子类名) 父类名;

【注意】：
1、前提：对象原本创建是该子类，才能【还原】成该子类
2、必须【还原】成原本的子类对象，否则报错：java.lang.ClassCastException
*/
public class Demo_Upward_Downward {

    public static void main(String[] args) {

        //向上转型（多态）
        Animal animal = new Cat();
        animal.eat(); //父类对象调用的是子类Cat的覆写方法，即子类被当做animal使用

        //animal.catchMouse(); 错误！向上转型后，父类不能使用子类特有方法

        //======================================================================
        //向下转型（还原）
        Cat cat = (Cat) animal; //原本new的是Cat类，还原成Cat类对象
        cat.catchMouse(); //还原为Cat类后，可以使用其特定方法了

        //错误转型：原本创建的是Cat类，还原成Dog类）
        Dog dog=(Dog) animal; //编译不报错，运行报错：类转换异常【java.lang.ClassCastException】
    }
}
