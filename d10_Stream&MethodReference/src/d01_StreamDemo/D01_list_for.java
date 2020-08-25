package d01_StreamDemo;
/*
 * 【传统遍历集合】：过滤符合条件的元素，保存到新的集合中
 *
 *       - 共3次for循环，有些浪费
 * */

import java.util.ArrayList;
import java.util.List;

public class D01_list_for {

    public static void main(String[] args) {

        List<String> list = List.of("张无忌", "周芷若", "张强", "张三丰");

        //1.名字三个字的，保存到集合A
        ArrayList<String> listA = new ArrayList<String>();
        for (String s : list) {
            if (s.length() == 3) {
                listA.add(s);
            }
        }

        //2.其中又姓张的，保存到集合B
        ArrayList<String> listB = new ArrayList<String>();
        for (String s : listA) {
            if (s.startsWith("张")) {
                listB.add(s);
            }
        }

        //3.遍历集合B
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
