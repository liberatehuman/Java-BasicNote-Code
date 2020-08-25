package d09_Iterator;

import java.util.ArrayList;

/*
 * 【forEach循环】：底层基于【iterator】的增强for循环，简化迭代器书写
 *   （JDK1.5+新特性，目标只能是【集合/数组】，【只为遍历用】）
 *
 *   public interface Iterable<T>：所有Iterable接口的实现类都能使用foreach
 *      （T：Type，参数数据类型）
 *
 *   Collection<E> extends Iterable<E>：所有单列集合均可使用foreach
 *
 * 【forEach 格式】：
 *       for(数据类型 变量名 : 集合/数组名){
 *           ...
 *       }
 * */
public class Foreach {

    public static void main(String[] args) {

        //forEach遍历集合元素
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("迪丽热巴");
        arrayList.add("古力娜扎");
        arrayList.add("马尔扎哈");
        arrayList.add("真皮沙发");

        for (String s : arrayList) {
            System.out.println("集合元素：" + s);
        }

        //forEach遍历数组元素
        int[] array = {1, 2, 3, 4, 5};

        for (int i : array) {
            System.out.println("数组元素：" + i);
        }
    }
}
