package my.algorithms.sort;

/* 【归并排序】
 *
 * 【原理】：
 *  1、尽可能的一组数据拆分成两个元素相等的子组，并对每一个子组继续拆分，直到拆分后每个子组的元素个数是 1 为止
 *  2、将相邻的两个子组进行合并成一个有序的大组
 *  3、不断的重复步骤2，直到最终只有一个组为止
 *
 * 【时间复杂度】：
 *      最坏情况：{5,4,3,2,1}
 *          - 拆分次数：至少 log2(N)（2^k ≥ N 不一定每次均分）
 *          - 比较次数：每层 (2^i)* 2^(log2(N)-i) = 2^log2(N) = N
 *              第 i 次拆分，2^i 个子组，每个长度 2^(k-i)=2^(log2(N)-i)，每组最多比较 2^(log2(N)-i) 次
 *
 *      O(N * log2(N)) ~ O(N logN)
 *  */
public class Merge {

    private static Comparable[] assistArray;//辅助数组，用于接收归并后的各个元素

    //整个数组排序
    public static void sort(Comparable[] a) {
        assistArray = new Comparable[a.length];//初始化辅助数组
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);//排序
    }

    //对子组排序
    private static void sort(Comparable[] a, int l, int r) {
        //终止条件
        if (l == r) {//相等说明就一个元素，停止
            return;
        }
        //1. 划分数组
        int mid = l + (r - l) / 2;//划分一次，得到两个子组（左&右）
        //*** mid值并不只有一个，在每个调用体里都有一个mid，只存在自己的栈空间【画内存图即可】
        //最后每个mid==l==h，即单个元素

        sort(a, l, mid);//每次先向左划分，划分到1个元素，开始归并
        sort(a, mid + 1, r);//左半边归并完，每次再向右划分，同上
        merge(a, l, mid, r);//从最后被递归调用的sort开始执行，即从最小单元执行，最后才是数组的两半归并
    }

    //【归并】（以中间某步理解，最小单元不好理解）
    private static void merge(Comparable[] a, int l, int mid, int r) {
        int p1 = l;//指针1 -> 左子组头索引
        int p2 = mid + 1;//指针2 -> 右子组头索引
        int i = l;//指针i -> 辅助数组头索引

        while (p1 <= mid && p2 <= r) {//两个子组都还没完
            if (isLess(a[p1], a[p2])) {
                assistArray[i++] = a[p1++];//较小者放入辅助数组，指针均向后1位
            } else assistArray[i++] = a[p2++];
        }
        while (p1 <= mid) {//右子组已用完
            assistArray[i++] = a[p1++];
        }
        while (p2 <= r) {//左子组已用完
            assistArray[i++] = a[p2++];
        }

        for (int k = l; k <= r; k++) {//辅助数组中 l~r 的元素已有序，复制到原数组
            a[k] = assistArray[k];
        }
    }

    private static boolean isLess(Comparable c1, Comparable c2) {
        return (c1.compareTo(c2) < 0);
    }

    //用了辅助数组，不需要交换值
//    private static void exchange(Comparable[] a, int i, int j) {
//        Comparable temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }

}
