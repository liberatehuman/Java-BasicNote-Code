package d30_RedPacket_Random_Avg;

import java.util.ArrayList;
import java.util.Random;

public class LuckyRed implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
                                    //加final的习惯，保证值不会变化
        ArrayList<Integer> list = new ArrayList<>();

        int leftMoney = totalMoney;
        int leftCount = totalCount;

        Random rand = new Random();

        for (int i = 0; i < (totalCount - 1); i++) {
            //红包金额范围：最少1分，最多得让最后剩下俩人都有钱拿
            int money = 1 + rand.nextInt(leftMoney / leftCount * 2);
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }
        list.add(leftMoney); //最后剩下的钱放最后一个红包

        return list;
    }
}
