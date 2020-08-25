package d08_Collecetion;

import java.util.Collection;
import java.util.HashSet;
/*
 * 【java.util.Collection接口】：所有【单列（单身）】集合的最顶层接口，包含所有单列集合通用的方法
 *
 * 【通用方法】：
 * 1、public boolean add(E e)：添加指定对象到当前集合（返回true/flase，一般无需接收）
 *
 * 2、public boolean remove(E e)：移除当前集合的指定对象（返回true/flase，一般无需接收）
 *
 * 3、public boolean contains(E e)：判断当前集合是否包含某元素
 *
 * 4、public boolean isEmpty(E e)：判断当前集合是否为空
 *
 * 5、public int size(E e)：返回集合中元素的个数
 *
 * 6、public Object[] toArray()：将集合元素存储到数组中
 *
 * 7、public void clear()：清空集合所有元素（集合仍存在）
 *
 * （ E ：Element，集合元素 ）
 * */
public class GeneralMethod {

    public static void main(String[] args) {

        //创建集合，可以多态
        Collection<String> collection = new HashSet<>();//多态；无序集合，但不是每次随机顺序

        //add
        collection.add("迪丽热巴");
        collection.add("古力娜扎");
        collection.add("马尔扎哈");
        collection.add("真皮沙发");
        System.out.println(collection);//打印出内容，说明重写了toString方法

        boolean b = collection.add("真皮沙发");//false，Set接口不运行元素重复（多态，HashSet调用父类方法）
        System.out.println(b);

        //remove
        collection.remove("真皮沙发");
        System.out.println(collection);

        //contains
        System.out.println(collection.contains("真皮沙发"));

        //isEmpty
        System.out.println(collection.isEmpty());

        //size
        int n = collection.size();
        System.out.println("集合元素个数" + n);
        System.out.println("===============");

        //toArray，返回Object[]
        Object[] objArray = collection.toArray();

        for (int i = 0; i < objArray.length; i++) {
            System.out.println(objArray[i]);
        }
        System.out.println("===============");

        //clear
        collection.clear();
        System.out.println("清空后：" + collection);
    }
}
