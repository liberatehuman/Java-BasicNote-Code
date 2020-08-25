package d16_Map;
/*
 * 【java.util. Map<K,V> 接口】：区别于 Collection<E> 接口（单列（单身）集合）
 *
 * 【特点】：
 * 1、【双列】(夫妻)集合，每个元素包含两个值：key 和 value
 *
 * 2、集合元素的 key 和 value【一一对应】
 *
 * 3、集合元素的 key【不重复】，value【可重复】
 *
 * 4、集合元素的 key 和 value 的数据类型【可同可不同】
 *
 *      【注】：key 和 value 可以存储为【 null 值】
 *
 * 【通用方法】：
 * 1、public V put(K key, V value)：添加指定的键值对放入Map集合中，返回key添加前的value
 *
 * 2、public V get(K key)：根据指定键，返回其对应的值
 *
 * 3、public V remove(K key)：根据指定键，删除对应的键值对元素，返回被删元素
 *
 * 4、public boolean containsKey(K key)：判断集合是否包含指定键
 *
 * */

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        //put
        String value1 = map.put("a", "XXXX");
        System.out.println("value1：" + value1);//null
        System.out.println("value2：" + map.put("a", "古力娜扎"));//XXXX

        map.put("b", "迪丽热巴");
        map.put("c", "马尔扎哈");
        System.out.println(map);//{a=古力娜扎, b=迪丽热巴, c=马尔扎哈}【HashMap无序集合】

        //containsKey
        boolean b1 = map.containsKey("a");
        System.out.println("b1：" + b1);//true
        System.out.println("b2：" + map.containsKey("A"));//false

        //get
        String value3 = map.get("c");
        System.out.println("c的值：" + value3);
        System.out.println("d的值：" + map.get("d"));//null

        //remove
        String value4 = map.remove("c");
        System.out.println("被移除：" + value4);
        System.out.println(map.remove("d"));//null
    }
}
