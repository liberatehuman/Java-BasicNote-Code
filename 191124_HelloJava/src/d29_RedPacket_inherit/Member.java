package d29_RedPacket_inherit;

import java.util.ArrayList;
import java.util.Random;

//成员类
public class Member extends Employee {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //随机获得一个红包，取索引值
        Random rand = new Random();
        int index = rand.nextInt(list.size());

        //得到的红包钱，也就是从红包集合里【拿出】的索引位置元素（因为领了就没了）
        int gainMoney = list.remove(index);

        //当前成员本来的余额
        int money = super.getMoney();

        //拿到红包后的余额
        super.setMoney(money + gainMoney);
    }
}
