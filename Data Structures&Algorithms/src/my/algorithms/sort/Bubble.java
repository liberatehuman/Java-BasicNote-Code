package my.algorithms.sort;

/* 【冒泡排序】
 *
 * 【原理】：
 *  1. 相邻元素两者比较，大的往后放
 *  2. 对每组相邻元素做同样操作，从开始第一对到结尾的最后一对元素（最大值往末尾冒泡）
 *
 * 【时间复杂度】：
 *      最坏情况：{5,4,3,2,1}
 *          - 比较次数：(N-1)+(N-2)+...+2+1 = (N-1+1)*(N-1)/2 = 1/2(N^2-N)
 *          - 交换次数：同上（比较一次就会交换一次）
 *
 *      O(1/2(N^2-N) + 1/2(N^2-N)) = O(N^2-N) ~ 【O(N^2)】
 * */
public class Bubble {

    //排序
    public static void sort(Comparable[] a) {
        for (int i = a.length - 1; i > 0; i--) {//每次大者往后冒（每排一次，参与排序个数-1）
            for (int j = 0; j < i; j++) {//遍历每个位置
                if (isGreater(a[j], a[j + 1])) {//相邻两者比较大小
                    exchange(a, j, j + 1);//交换位置
                }
            }
        }
    }

    //比较大小（private即可）
    private static boolean isGreater(Comparable c1, Comparable c2) {
        return (c1.compareTo(c2) > 0);//int compareTo 返回大者
    }

    //交换位置（private即可）
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
