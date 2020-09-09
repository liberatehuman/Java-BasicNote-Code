package my.algorithms.sort;

/* 【选择排序】
 *
 * 【原理】：
 *  1.每次遍历时，都设第一个索引处的元素是最小值，与其他元素依次比较，
 *      若当前索引处的值大于其他某个索引处的值，则该索引标记为最小值，最后可以找到最小值所在的索引
 *  2.交换第一个索引处和最小值所在的索引处的值
 *
 * 【时间复杂度】：
 *      最坏情况：{5,4,3,2,1}
 *          - 比较次数：(N-1)+(N-2)+...+2+1 = 1/2(N^2-N)
 *          - 交换次数：N-1
 *
 *      O(1/2(N^2-N) + (N-1)) ~ 【O(N^2)】
 *  */
public class Selection {

    public static void sort(Comparable[] a) {
        for (int i = 0; i <= a.length - 2; i++) {//假定首个元素是最小值，直到倒数第二个元素，比较最后一次
            int minIndex = i;//最小值标记
            //与"最小值"比较
            for (int j = i + 1; j < a.length; j++) {//选后面每个元素进行比较
                if (isGreater(a[minIndex], a[j])) {//"最小值" > j 处的值
                    minIndex = j;//标记 j 处是最小值
                }
            }
            //交换
            exchange(a, i, minIndex);//全部比完，交换该元素和最小值的位置...
        }
    }

    private static boolean isGreater(Comparable c1, Comparable c2) {
        return (c1.compareTo(c2) > 0);
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
