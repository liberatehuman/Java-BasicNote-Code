package d12_Properties;
/*
 * 【【java.util.Properties 类】extends Hashtable<K,V>】implements Map<K,V>
 *
 *      - Properties 集合表示了一个【持久的属性集】，可保存在流中或从流中加载
 *
 *      - Properties 集合是唯一与 IO 流结合的集合
 *
 * 【方法】：
 *  1、Object setProperty(String key, String value)：添加键值内容（会调用HashTable）
 *
 *  2、String getProperty(String key)：根据 key 获取 value（相当于 Map 的 get(key)方法）
 *
 *  3、Set<String> stringPropertyNames()：返回此属性集中的 key 集（相当于 Map 的 keySet 方法）
 *  -----------------
 * 【与流相关方法】：
 *  1、将集合中的临时数据【持久化】写入硬盘中
 *      - void store(OutputStream os, String comments)：用字节输出流将临时数据写入硬盘
 *      - void store(Writer w, String comments)：用字符输出流将临时数据写入硬盘
 *
 *  2、加载硬盘中保存的数据（键值对）到集合中
 *      - void load(InputStream is)
 *      - void load(Reader r)
 *
 * 【注】：
 *      属性集是【双列集合】，其 key 和 value 都是【字符串】
 * */

import java.util.Properties;
import java.util.Set;

public class D01 {

    public static void main(String[] args) {

        //创建一个属性集对象
        Properties p = new Properties();

        //调用 setProperty 添加键值内容
        p.setProperty("迪丽热巴", "27");
        p.setProperty("古力娜扎", "25");
        p.setProperty("马尔扎哈", "99");

        //p.put(1,true);//可以调用 Map 的 put 方法添加其他类型键值，但意义不大
        //System.out.println(p);{1=true, 迪丽热巴=27, 古力娜扎=25, 马尔扎哈=99}

        //调用 stringPropertyNames 获取 key 集
        Set<String> set = p.stringPropertyNames();

        for (String key : set) {
            //调用 getProperty 获取 key 对应 value
            System.out.println("key：" + key + "，value：" + p.getProperty(key));
        }
    }
}
