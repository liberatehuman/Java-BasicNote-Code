package d15_Arrays;
/*
【java.util.Arrays】：一个与【数组相关】的工具【类】，里面提供了大量【静态方法】，以实现数组常见操作

1、public static String toString(数组)：将参数数组变为字符串（按默认格式：[元素1, 元素2,...] ）

2、public static void sort(数组)：按默认升序对数组元素排序（注意无返回值）

【注】：
1、sort对数值，默认按升序（从小到大）

2、sort对字符串，默认按字母升序

3、***若是自定义的类型，那么这个自定义类需要有Comparable或Comparator接口的支持（今后）
*/

import java.util.Arrays;

public class ArraysMethod {

    public static void main(String[] args) {
        //int[]数组转为字符串
        int[] intArray = {10, 20, 30};
        String intStr = Arrays.toString(intArray); //Arrays是个类，要Arrays.方法名(数组)
        System.out.println(intStr);

        //对数组元素升序排序
        int[] array = {2, 1, 4, 0, 9, 5};
        Arrays.sort(array); //sort方法无返回值；sort后，数组内容已经改变
        System.out.println(Arrays.toString(array));

        String[] strings = {"aaa", "AAA", "000"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
