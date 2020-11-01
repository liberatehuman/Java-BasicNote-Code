package d12_List_ArrayList;

//随机生成10个整数放入ArrayList集合，筛选其中的偶数元素，并存放到另一个小集合中

import java.util.ArrayList;
import java.util.Random;

public class Exercise4 {

    public static void main(String[] args) {

        ArrayList<Integer> listA = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            listA.add(rand.nextInt(10) + 1);
        }
        System.out.println("原来的集合A："+listA);

        ArrayList<Integer> listB = new ArrayList<>();
        System.out.println("其中的偶数集合B："+selectEvenNum(listA, listB));
    }

    public static ArrayList selectEvenNum(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if ((list1.get(i)) % 2 == 0) {
                list2.add(list1.get(i));
            }
        }
        return list2;
    }
}
