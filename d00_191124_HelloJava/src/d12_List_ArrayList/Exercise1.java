package d12_List_ArrayList;

//随机生成1~10的整数，存到ArrayList集合，并遍历

import java.util.ArrayList;
import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10) + 1);
        }
        //遍历
        for (int i : list  //foreach语句for(元素类型 元素变量: 集合名)
        ) {
            System.out.println(i); //这里的i不是索引，是每个元素的意思
        }

        System.out.println(list);
    }
}
