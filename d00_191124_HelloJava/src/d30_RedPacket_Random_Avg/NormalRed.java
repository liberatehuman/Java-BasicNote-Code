package d30_RedPacket_Random_Avg;

import java.util.ArrayList;

public class NormalRed implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
                                    //加final的习惯，保证值不会变化
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }

        list.add(avg + mod);

        return list;
    }
}
