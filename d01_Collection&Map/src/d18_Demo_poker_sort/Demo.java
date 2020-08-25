package d18_Demo_poker_sort;
/*
 * 【集合综合案例】：【斗地主】洗牌、发牌、看牌，并实现手牌从大到小【排序】
 *
 * 【思路】：
 *      HashMap集合存放 牌堆 =【key：牌索引】和【value：牌面】
 *
 *      ArrayList另存牌索引
 *
 *      洗牌、发牌都是针对【牌索引】
 *
 *      看牌则根据【牌索引】--> 找到牌面
 *
 * 【用到方法】：
 *      List.of(), Map.put()/get(), List.add()/get(), Collections.shuffle(), Collections.sort()
 * */

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        //1.准备牌堆
        HashMap<Integer, String> poker = new HashMap<>();//牌堆集合，key:牌索引，value:牌面(大小 + 花色)
        ArrayList<Integer> index = new ArrayList<>();//牌索引集合

        List<String> colors = List.of("♠", "♦", "♥", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J",
                "10", "9", "8", "7", "6", "5", "4", "3");

        int n = 0;//牌索引起点
        poker.put(n, "大王");//同时放入牌堆
        index.add(n);//同时放入所索引集合
        n++;
        poker.put(n, "小王");
        index.add(n);
        n++;
        for (String number : numbers) {//组装牌面【要实现牌从大到小排序，应先按大小组装，再花色】
            for (String color : colors) {
                poker.put(n, color + number);//同时放入牌堆
                index.add(n);//同时放入所索引集合
                n++;
            }
        }
        System.out.println(poker);
        System.out.println(index);

        //2.洗牌【洗索引集合】
        Collections.shuffle(index);

        //3.发牌（玩家手牌是【索引集合】）
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();

        for (int i = 0; i < index.size(); i++) {
            if (i >= 51) {
                bottom.add(index.get(i));
            } else if (i % 3 == 0) {
                p1.add(index.get(i));
            } else if (i % 3 == 1) {
                p2.add(index.get(i));
            } else if (i % 3 == 2) {
                p3.add(index.get(i));
            }
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(bottom);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(bottom);

        //4.看牌
        look("刘德华", poker, p1);
        look("周星驰", poker, p2);
        look("周润发", poker, p3);
        look("底牌", poker, bottom);
    }

    //定义看牌方法，提高复用性
    //参数：玩家名、牌堆、牌索引
    public static void look(String name, HashMap<Integer, String> poker, ArrayList<Integer> player) {
        System.out.print(name + ":");//姓名不换行
        for (int i = 0; i < player.size(); i++) {
            System.out.print(poker.get(player.get(i)) + ",");//根据牌索引(key)找到对应的map值
        }
        System.out.println();//每个玩家换行

    }
}
