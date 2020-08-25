package d17_of_JDK9;
/*
 * 【List/Set/Map接口 静态方法：of 】：一次性添加元素到集合中（JDK 9）
 *
 *       static <E> List/Set/Map<E> of(E... elements)
 *
 * 【使用场景】：集合元素个数已经确定，且不再改变
 *
 * 【注】：
 *  1、of 方法只适用于三个接口，【实现类不适用】
 *
 *  2、of 返回的是【不可变】集合，再对其add/put等添加，会抛异常
 *
 *  3、Set 和 Map 集合使用 of 添加，必须【无重复】元素，否则抛异常
 *
 * */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "c", "a");
        System.out.println(list);

        //Set<String> set = Set.of("a", "b", "c", "a");// Set.of 不允许元素重复
        //IllegalArgumentException:非法参数异常
        Set<String> set = Set.of("a", "b", "c");
        System.out.println(set);

        //Map<String, Integer> map = Map.of("风", 1, "云", 2, "风", 3);
        //Map<String, Integer> map1 = Map.of("风", 1, "云", 2,"决",1);
        //Map.of 不允许元素重复（仅 key/value 重复都不行）
        //IllegalArgumentException:非法参数异常
        Map<String, Integer> map = Map.of("风", 1, "云", 2);
        System.out.println(map);

        //of 方法返回的不可变集合，无法继续添加元素
        //list.add("d");//UnsupportedOperationException
        //set.add("d");//UnsupportedOperationExceptio
        //map.put("决",3);//UnsupportedOperationExceptio
    }
}
