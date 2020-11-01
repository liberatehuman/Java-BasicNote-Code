package d12_List;
/*
 * java.util.【List<E> 接口】extends Collection<E> 接口
 *
 * List接口特点：
 * 1、【有序】的集合，存、取元素顺序一致（存：123，取：123）
 * 2、【索引】包含带索引的方法
 * 3、【重复】元素允许
 *
 * 特有【带索引方法】：
 * 1、public void add(int index, E element)：添加元素到指定索引处
 * 4、public E set(int index)：设置指定索引元素，返回的是【更新前】的元素
 * 2、public E get(int index)：获取指定索引元素，返回的是
 * 3、public E remove(int index)：移除指定索引元素，返回的是被删元素
 *
 * 【注】防止异常：
 *      IndexOutOfBoundsException：索引越界异常（集合）
 *      ArrayIndexOutOfBoundsException：数组索引越界异常
 *      StringIndexOutOfBoundsException：字符串索引越界异常
 * */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Method {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();//多态，使用List接口的方法

        list.add("a");
        list.add("b");
        list.add("c");

        //add(index,element)（允许重复）
        list.add(3, "a");//因为有序，顶多在末尾添加（index=length），超出会异常

        //set(index)
        String s2 = list.set(2, "!");
        System.out.println(s2);//返回的是【更新前】的元素："c"

        //get(index)
        String s1 = list.get(3);
        System.out.println(s1);

        //remove(index)
        String s3 = list.remove(2);
        System.out.println(s3);

        System.out.println(list);
        System.out.println("===============");

        //【复习】遍历List集合元素3种方式：
        //1.forEach循环
        for (String s : list) {
            System.out.println(s);
        }
        //2.iterator迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        //1.for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
