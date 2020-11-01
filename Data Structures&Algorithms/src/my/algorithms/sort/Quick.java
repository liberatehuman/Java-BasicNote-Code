package my.algorithms.sort;

/* 【快速排序】
 *
 * 【原理】：
 *  1、首先设定一个分界值，通过该分界值将数组分成左右两部分
 *  2、将 ≤ 分界值的数据放到数组的左边，≥ 分界值的数据放到到数组右边
 *  3、左边和右边的数据可以继续独立排序
 *  4、重复上述过程（通过递归将左侧部分排好序后，再递归排好右侧部分的顺序）
 *      当左侧和右侧两个部分的数据排完序后，整个数组的排序也就完成了。
 *
 * 【时间复杂度】：
 *      最优情况：类似归并
 *          O(NlogN)
 *      最坏情况：每次找到的分界值是组内最大/小值
 *          - 拆分次数：N（每次切分都有一个子组）
 *          - 扫描次数：N
 *          O(N^2)
 *      平均情况：O(NlogN)
 *  */
public class Quick {

    public static void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    private static void sort(Comparable[] a, int l, int r) {
        if (l == r) {
            return;
        }
        //1. 划分数组
        int p = partition(a, l, r);//获取分界索引

        sort(a, l, p - 1);//左子组排序（分界元素不参与）
        sort(a, p + 1, r);//右子组排序（分界元素不参与）
    }

    private static int partition(Comparable[] a, int l, int r) {
        int pLeft = l;//左指针 -> 头索引
        int pRight = r + 1;//右指针 -> 最大索引下一位置

        while (true) {
            //右指针向左扫描，找到比分界值小的元素，停下
            while (isLess(a[l], a[--pRight])) {//只要分界值较小，就一直移动指针找
                if (pRight == l) {//右指针到底，结束循环
                    break;
                }
            }
            //左指针向右扫描，找到比分界值大的元素，停下
            while (isLess(a[++pLeft], a[l])) {//只要分界值较大，就一直移动指针找
                if (pLeft == r) {//左指针到底，结束循环
                    break;
                }
            }

            if (pLeft == pRight) {//当左、右指针重合，扫描完毕
                break;
            } else exchange(a, pLeft, pRight);//正常则交换较大较小元素
        }

        exchange(a, l, pLeft);//扫描完毕，分界值放到分界处（pLeft/pRight一样）

        return pLeft;
    }

    private static boolean isLess(Comparable c1, Comparable c2) {
        return (c1.compareTo(c2) < 0);
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
