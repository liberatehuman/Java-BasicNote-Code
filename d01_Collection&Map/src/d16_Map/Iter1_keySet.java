package d16_Map;
/*
 * 【遍历 Map 集合元素】1 ：【键找值】（ key -> value ）
 *
 * 【方法】：
 *       Set<K> keySet()：返回此映射中包含key的Set集合视图
 *
 * 【步骤】：
 * 1、使用 Map 集合的 keySet 方法，将元素的 key 保存到 Set 集合中
 * 2、遍历 Set 集合，获取每个key（forEach 或 迭代器）
 * 3、使用 Map 集合的get(key)，获取每个 key 对应的 value
 *
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iter1_keySet {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("娜扎", 18);
        map.put("热巴", 25);
        map.put("扎哈", 99);

        //1.keySet：Key --> Set
        Set<String> keySet = map.keySet();

        //2.遍历Set中的key
        for (String s : keySet) {
            //3.get(key)
            System.out.println("key:" + s + ",value:" + map.get(s));
        }
//        //1.和2.可并为一步：
//        for (String s : map.keySet()) {
//            System.out.println("key:" + s + ",value:" + map.get(s));
//        }
        System.out.println("================");

        //（或迭代器遍历）
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("key:" + key + ",value:" + map.get(key));
        }

    }
}
