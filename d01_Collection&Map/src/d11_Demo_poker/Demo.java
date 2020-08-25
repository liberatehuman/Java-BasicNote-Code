package d11_Demo_poker;
/*
 * 【案例】：利用集合，实现【斗地主】的洗牌、发牌
 *
 * 【分析】：
 *   牌堆（ArrayList）：52 + 大王 + 小王 = 54张
 *   玩家（ArrayList）：17 * 3 = 51张
 *   底牌（ArrayList）：3张
 *
 *   每张牌：大小 + 花色
 *
 *   洗牌：ava.util.Collection【s】的方法：public static void shuffle(List<?> list)
 *   发牌：ArrayList.add()
 * */

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {

        ArrayList<String> poker = new ArrayList<>();

        String[] colors = {"♠", "♦", "♥", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        //嵌套for循环，给牌添加大小和花色
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
        poker.add("大王");
        poker.add("小王");

        //原始牌堆
        System.out.println(poker);

        //洗牌
        Collections.shuffle(poker);

        //3名玩家的牌和底牌
        ArrayList<String> bottom = new ArrayList<>();
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {

            String p_i = poker.get(i);//取poker中的元素，即每张牌

            if (i >= 51) { //发到51张，说明玩家手牌已发完，剩3张作底牌
                bottom.add(p_i);
            }
            // i%n 有n种结果，分可别代表玩家1，2，3
            else if (i % 3 == 0) {
                play1.add(p_i);
            }
            else if (i % 3 == 1) {
                play2.add(p_i);
            }
            else if (i % 3 == 2) {
                play3.add(p_i);
            }
        }

        System.out.println("玩家1：" + play1);
        System.out.println("玩家2：" + play2);
        System.out.println("玩家3：" + play3);
        System.out.println("底牌：" + bottom);
    }
}
