package d09_Iterator;
/*
 * 【java.util.Iterator 接口】：用于遍历集合中的元素
 *
 *  常用方法：
 *  1、boolean hasNext()：当集合还有下一个元素可供遍历，返回true
 *  2、E next()：返回集合的下一个元素
 *
 * 【注】：Iterator接口无法直接创建对象使用，需要 Collection 的 iterator() 方法，返回 Iterator 实现类对象
 *   Iterator<E> iterator() //返回在此集合上进行遍历的迭代器对象
 *
 * 【使用步骤（重点）】：
 *  1、使用集合中的 iterator() 方法创建Iterator接口的实现类对象，用 Iterator 接口接收（多态）
 *
 *  2、使用 Iterator 接口的 hasNext() 方法，判断是否还有元素可供遍历
 *
 *  3、使用 Iterator 接口的 next() 方法，取出下一个元素
 * */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo {

    public static void main(String[] args) {

        //创建一个集合
        Collection<String> collection = new ArrayList<>();
        collection.add("我");
        collection.add("爱");
        collection.add("你");
        collection.add("吗");

        //1.Iterator接口接收       <-- 集合的iterator方法创建Iterator接口的实现类对象
        Iterator<String> iterator = collection.iterator();

        //2.hasNext判断
        while (iterator.hasNext()) {

            //3.next取出
            String s = iterator.next();
            System.out.println(s);
        }
    }

}
