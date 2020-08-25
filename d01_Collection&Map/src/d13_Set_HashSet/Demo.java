package d13_Set_HashSet;
/*
 * 【java.util.HashSet<E>类】implements Set接口
 *
 * HashSet接口特点：
 * 1、【不重复】元素
 *
 * 2、【无索引】，没有带索引的方法，【也无法用普通for循环遍历】
 *
 * 3、【无序】集合，存取顺序可能不同
 *
 * 4、【底层】：哈希表（查询非常快）= 数组 + 链表/红黑树
 *
 * 5、【不同步】(多线程)
 * */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);
        boolean b = set.add(3);//不允许重复
        System.out.println(b);
        System.out.println(set);

        //遍历集合元素2种方式（不能普通for循环）
        //1.forEach循环
        for (Integer integer1 : set) {
            System.out.println(integer1);
        }
        //2.迭代器
        Iterator<Integer> integer = set.iterator();
        while (integer.hasNext()) {
            Integer n = integer.next();
            System.out.println(n);
        }

    }
}
