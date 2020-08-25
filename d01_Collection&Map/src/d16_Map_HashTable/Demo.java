package d16_Map_HashTable;
/*
* 【java.util.Hashtable<K,V> 类】implements Map<K,V>接口
*
* 【特点】：
* 1、【同步】（单线程/线程安全，速度慢）
*
* 2、【不可存储 null】类型的 key 和 value（其余 Map 集合的键值均可存储为 null）
*
* 3、【被取代】，像 Vector 一样在JDK 1.2+，被更先进的集合(HashMap,ArrayList)取代了
*
* 4、【子类: Properties 集合】依旧活跃，【唯一】与【IO流】相结合的集合
*
* */
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Map<String,String> hashTable=new Hashtable<>();
        //hashTable.put(null,"a");//NullPointerException
        //hashTable.put("b",null);//NullPointerException
        //hashTable.put(null,null);//NullPointerException
        hashTable.put("G","G");
        System.out.println(hashTable);
    }
}
