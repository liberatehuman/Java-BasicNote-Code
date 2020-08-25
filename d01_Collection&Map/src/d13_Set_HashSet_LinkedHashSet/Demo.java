package d13_Set_HashSet_LinkedHashSet;
/*
* 【java.util.LinkedHashSet<E>类】extends HashSet<E>类（implements Set<E>）
*
* LinkedHashSet类【特点】：
*
*   底层：哈希表【数组+链表/红黑树】+【单向链表】<--专门用于保存元素的存储顺序
*
*   => 在继承HashSet的基本特性和方法基础上，保存的元素是【有序】的
*
* */
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo {

    public static void main(String[] args) {

        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("www");
        hashSet.add("abc");
        hashSet.add("com");
        hashSet.add("www");
        System.out.println(hashSet);//[com, abc, www] 无序，不重复

        LinkedHashSet<String> linked=new LinkedHashSet<>();
        linked.add("www");
        linked.add("hi");
        linked.add("com");
        linked.add("www");
        System.out.println(linked);//[www, hi, com] 有序，但不重复
    }
}
