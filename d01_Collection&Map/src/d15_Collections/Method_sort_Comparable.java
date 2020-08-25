package d15_Collections;
/*
 *【java.util.Collections】.【sort（1. Comparable 接口）】：将集合元素按【默认】规则排序
 *
 *      public static <T extends Comparable<? super T>> void sort(List<T> list)
 *
 *【使用前提】：
 *      被排序的集合的元素，必须实现【Comparable接口】，并重写其抽象方法【compareTo】定义排序规则
 *
 *【排序规则】：（原理数据结构排序算法？）
 *      (A,B) -> return A-B;//升序
 *          ≥ 1：    A > B，按[B,A]排
 *          (-1,1)：表示相等，按存储顺序排
 *          ≤ -1：   A < B，按[A,B]排
 * */

import java.util.ArrayList;
import java.util.Collections;

public class Method_sort_Comparable {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 3, 2);
        System.out.println(list1);//[1,3,2]

        Collections.sort(list1);
        System.out.println("排序后：" + list1);//[1,2,3]

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "a", "c", "b");
        System.out.println(list2);//[a,c,b]

        Collections.sort(list2);
        System.out.println("排序后：" + list2);//[a,b,c]

        //自定义类作为集合元素排序
        ArrayList<Person> list3 = new ArrayList<>();
        Person p1 = new Person("你", 30);
        Person p2 = new Person("我", 25);
        Person p3 = new Person("他", 35);
        Collections.addAll(list3, p1, p2, p3);
        System.out.println(list3);

        Collections.sort(list3);//元素Person类必须重写compareTo，才能使用sort，否则编译报错
        System.out.println(list3);
    }
}
