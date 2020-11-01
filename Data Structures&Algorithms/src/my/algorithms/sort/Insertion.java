package my.algorithms.sort;

/* 【插入排序】
 *
 * 【原理】：
 *  1、把所有元素看作两部分：已经排序的和未排序的
 *  2、找到未排序第一个元素，向已排序的组中进行插入
 *  3、倒叙遍历已排序元素，依次和待插元素比较
 *      直到找到一个元素小于等于待插入元素，那么就把待插入元素放到这个位置（其他的元素向后移动一位）
 *
 * 【时间复杂度】：
 *      最坏情况：{5,4,3,2,1}
 *          - 比较次数：1+2+...+(N-1) = 1/2(N^2-N)
 *          - 交换次数：同上，每比较一次交换一次
 *
 *      O(1/2(N^2-N) + 1/2(N^2-N)) ~ 【O(N^2)】
 *  */
public class Insertion {

    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {//默认选择第二个开始与前面的元素比较
            for (int j = i; j > 0; j--) {//倒序比较 j 处与前面已排序的值
                if (isGreater(a[j - 1], a[j])) {//若前面的大
                    exchange(a, j - 1, j);//交换
                } else {
                    break;//若前面排完已经小了，就跳出本次循环，选下一个元素...
                }
            }
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
