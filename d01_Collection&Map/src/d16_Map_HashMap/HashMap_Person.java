package d16_Map_HashMap;
/*
 * 【 HashMap 存放自定义类型元素】
 *
 * 【注】：
 *      key 若使用自定义类型，其类必须重写 hashCode 和 equals 方法，【保证不重复】
 *
 * */

import java.util.HashMap;
import java.util.Map;

public class HashMap_Person {

    public static void main(String[] args) {

        //1. key: String    value: Person
        Map<String, Person> map1 = new HashMap<>();
        map1.put("北京", new Person("老炮", 50));
        map1.put("上海", new Person("赤佬", 20));
        map1.put("广东", new Person("扑街", 30));
        map1.put("上海", new Person("瘪三", 20));
        //keySet 遍历
        for (String s : map1.keySet()) {
            System.out.println(s + "-->" + map1.get(s));
        }

        //2. key: Person    value: String
        Map<Person, String> map2 = new HashMap<>();
        map2.put(new Person("老炮", 50), "北京");
        map2.put(new Person("赤佬", 20), "上海");
        map2.put(new Person("扑街", 30), "广东");
        map2.put(new Person("赤佬", 20), "北京");
        //entrySet 遍历
        for (Map.Entry<Person, String> entry : map2.entrySet()) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }
    }
}
