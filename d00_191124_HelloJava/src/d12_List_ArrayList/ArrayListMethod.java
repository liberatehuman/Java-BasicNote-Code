package d12_List_ArrayList;
/*
【ArrayList常用方法】：
1、public boolean add(E e)：向集合内添加元素。参数类型e和泛型E一致，返回值表示是否成功添加
【注】：各种集合中，ArrayList集合的add操作【必定成功（返回true）】，故返回值可用可不用
但是对于其他集合类型的add操作并不一定成功

2、public E get(int index)：从集合中获取元素，参数是元素索引，返回值是对应元素

3、public E remove(int index)：从集合中删除元素，参数是元素索引，返回值是被删元素

4、public int size()：获取集合的尺寸长度，返回值是集合元素个数
*/

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        System.out.println(list);
        boolean addSuccess = list.add("真皮沙发");
        System.out.println("add成功："+addSuccess);

        String index1 = list.get(1);
        System.out.println(index1);
        System.out.println("索引为1的元素是：" + list.get(1));

        System.out.println("移除的元素是：" + list.remove(2));

        System.out.println("集合的长度是：" + list.size()); //注意有()，而数组的.length无括号
    }
}
