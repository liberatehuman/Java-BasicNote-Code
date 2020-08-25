package d05_Predicate;
/*
 * 【练习】：以【姓名长度、性别】为判断条件，筛选集合元素
 *
 *  要求：
 *       姓名长度：2
 *       性别：女
 * */

import java.util.ArrayList;
import java.util.function.Predicate;

public class EX {

    //用于筛选的方法
    public static ArrayList<String> listFilter(
            String[] strs, Predicate<String> predicate1, Predicate<String> predicate2) {

        //空集合
        ArrayList<String> list = new ArrayList<>();

        for (String s : strs) {//遍历
            if (predicate1.and(predicate2).test(s)) {//判断是否符合两个条件
                list.add(s);//符合的，添加到集合
            }
        }
        return list;//返回集合
    }


    public static void main(String[] args) {

        String[] arr = {"热巴，女", "娜扎，女", "扎哈，?"};

        ArrayList<String> list = listFilter(arr,
                (s) -> s.split("，")[0].length()==2,
                (s) -> s.split("，")[1].equals("女"));

        for (String s : list) {
            System.out.println(s);//热巴，女 娜扎，女
        }
    }


}
