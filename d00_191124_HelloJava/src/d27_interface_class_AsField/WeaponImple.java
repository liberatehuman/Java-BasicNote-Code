package d27_interface_class_AsField;

public class WeaponImple implements Weapon{

    @Override
    public void attack() {
        System.out.println("实现类覆写");
    }
}
