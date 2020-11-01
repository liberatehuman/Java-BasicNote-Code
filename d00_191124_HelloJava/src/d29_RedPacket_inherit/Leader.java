package d29_RedPacket_inherit;

import java.util.ArrayList;

//领导类
public class Leader extends Employee {

    public Leader() {
    }

    public Leader(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int sendMoney, int n) {

        //红包集合：存放要发的每个红包金额
        ArrayList<Integer> redPacket = new ArrayList<>();

        //领导余额
        int leftMoney = super.getMoney();

        if (leftMoney < sendMoney) { //钱够才能发
            System.out.println("余额不足");
            return redPacket; //返回空集合
        }

        //扣钱，重新设置余额
        super.setMoney(leftMoney - sendMoney);

        //包红包
        int avgMoney = sendMoney / n;
        int endMoney = sendMoney % n;

        for (int i = 0; i < n - 1; i++) {
            redPacket.add(avgMoney);
        }
        redPacket.add(avgMoney + endMoney); //除不尽的余数放到最后一个红包

        return redPacket; //返回红包集合

    }
}
