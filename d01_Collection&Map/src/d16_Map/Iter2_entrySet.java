package d16_Map;
/*
 * 【遍历 Map 集合元素】2 ：【键值对对象】
 *
 *      Map的嵌套类(内部类)：【Map.Entry<K,V> 接口】（static Interface Entry<K,V>）
 *
 *      一个Entry对象，同时包含一对 key 和 value（结婚证）
 *
 * 【方法】：
 *       Map: Set<Map.Entry<K,V>> entrySet()：返回此映射中包含映射关系(键值对)的集合视图
 *
 *       Entry: K getKey()：返回此Entry对象的key
 *              V getValue()：返回此Entry对象的value
 *
 * 【步骤】：
 *  1、使用 Map 集合的 entrySet 方法，将 Entry对象保存到 Set 集合中
 *  2、遍历 Set 集合，获取每个Entry对象（forEach 或 迭代器）
 *  3、使用 Entry 对象的 getKey 和 getValue 方法，获取每个 key 对应的 value
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iter2_entrySet {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("娜扎", 18);
        map.put("热巴", 25);
        map.put("扎哈", 99);

        //1.entrySet：Entry --> Set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        //2.遍历Set中的Entry
        for (Map.Entry<String, Integer> entry : entrySet) {
            //3.Entry的 getKey 和 getValue
            System.out.println("k:" + entry.getKey() + ",v:" + entry.getValue());
        }
        System.out.println("============");
        //（迭代器）
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println("k:" + k + ",v:" + v);
        }
    }
}
