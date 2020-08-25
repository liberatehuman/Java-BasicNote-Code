package d16_Map_HashMap_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 【java.util.LinkedHashMap<K,V> 类】extends HashMap<K,V> 类
 *
 * 【特点】：
 * 1、【底层】：哈希表 + 单向链表（保证迭代的顺序）
 *
 * 2、【有序】集合，存取顺序一致
 * */
public class Demo {

    public static void main(String[] args) {

        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "z");
        linked.put("a", "a");
        System.out.println(linked);//{c=c, b=b, a=a}
    }
}
