package d15_Collections;
/*
 * 【java.util.Collections类】：集合工具类，用于对集合进行操作
 *
 * 主要方法：
 * 1、public static <T> boolean addAll(Collection<T> c, T...elements)：添加一些元素到集合中
 *
 * 2、public static void shuffle(List<?> list)
 *
 * */

import java.util.ArrayList;
import java.util.Collections;

public class Method_addAll_shuffle {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //addAll
        boolean b = Collections.addAll(list, "a", "b", "c", "d", "d");//可变参数
        System.out.println(b);//true，List允许重复元素
        System.out.println(list);

        //shuffle
        Collections.shuffle(list);
        System.out.println(list);
    }
}
