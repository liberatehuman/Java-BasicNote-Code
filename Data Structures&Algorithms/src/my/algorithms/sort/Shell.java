package my.algorithms.sort;

/* 【希尔排序】（插入排序改进版）
 *
 * 【原理】：
 *  1、选定一个步长 h，按 h 长度对数据进行分组
 *  2、对分的每组数据【插入排序】
 *  3、缩短步长，重复第二步操作（最小为1）
 *
 * 【时间复杂度】：O(NlogN)
 *      事后分析（System.currentTimeMillis()），见 Sort06
 *      比插入排序快千倍
 *  */
public class Shell {

    public static void sort(Comparable[] a) {
        //1.确定步长 h 的初值
        int h = 1;
        while (h < a.length / 2) {
            h = 2 * h + 1;//无论数组长度奇偶，确保初始步长 ≥ 一半长度
        }
        while (h >= 1) {//步长减小到1为止
            for (int i = h; i < a.length; i++) {//每组找到待插元素
                for (int j = i; j >= h; j -= h) {//组内插入排序（就2个元素）
                    if (isGreater(a[j - h], a[j])) {
                        exchange(a, j - h, j);
                    } else {
                        break;
                    }
                }
            }
            h = h / 2;//缩短步长，重新分组...
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
