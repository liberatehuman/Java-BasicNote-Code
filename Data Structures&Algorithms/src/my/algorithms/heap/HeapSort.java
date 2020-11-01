package my.algorithms.heap;

public class HeapSort<E extends Comparable<E>> {

    //判断堆中索引 i 和 j 处的元素大小
    private static boolean isLess(Comparable[] heap, int i, int j) {
        return heap[i].compareTo(heap[j]) < 0;
    }

    //交换索引 i 和 j 处的元素
    private static void exchange(Comparable[] heap, int i, int j) {
        Comparable temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    //根据源数组，构建堆
    private static void createHeap(Comparable[] sourceArray, Comparable[] heap) {
        //复制元素到堆中（从堆的1索引开始存）
        System.arraycopy(sourceArray, 0, heap, 1, sourceArray.length);
        //对堆做下沉，使元素有序（从一半开始（即叶子结点上一层，从右往左），往1索引）
        for (int i = (heap.length - 1) / 2; i > 0; i--) {
            sink(heap, i, heap.length - 1);
        }
    }

    //对源数组中数据进行从小到大排序
    public static void sort(Comparable[] sourceArray) {
        //构建堆
        Comparable[] heap = new Comparable[sourceArray.length + 1];//从 1 索引开始
        createHeap(sourceArray, heap);//（内含sink，使元素有序，不是从小到大的堆排序）

        int maxIndex = heap.length - 1;//记录未排序元素中的最大索引
        //通过循环下沉，交换索引 1 处元素和待排最大索引初元素
        while (maxIndex != 1) {
            exchange(heap, 1, maxIndex);//交换
            maxIndex--;//交换完，最大索引处元素不动
            sink(heap, 1, maxIndex);//（该sink是实现从小到大顺序）
        }
        //堆中排完序的元素复制到源数组中
        System.arraycopy(heap, 1, sourceArray, 0, sourceArray.length);
    }

    //下沉算法（在堆中，对 target 处元素做下沉，范围 0~arrange）
    private static void sink(Comparable[] heap, int target, int arrange) {
        while (2 * target <= arrange) {
            int maxIndex;
            if (2 * target + 1 <= arrange) {
                if (isLess(heap, 2 * target, 2 * target + 1)) {
                    maxIndex = 2 * target + 1;
                } else {
                    maxIndex = 2 * target;
                }
            } else {
                maxIndex = 2 * target;
            }

            if (isLess(heap, maxIndex, target)) {
                break;
            }

            exchange(heap, target, maxIndex);
            target = maxIndex;
        }
    }
}
