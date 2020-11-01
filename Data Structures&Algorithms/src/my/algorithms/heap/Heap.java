package my.algorithms.heap;

public class Heap<E extends Comparable<E>> {

    private E[] elements;
    private int n;

    public Heap(int capacity) {
        this.elements = (E[]) new Comparable[capacity + 1];
        this.n = 0;
    }

    //判断索引 i 和 j 处的元素大小
    private boolean isLess(int i, int j) {
        return elements[i].compareTo(elements[j]) < 0;
    }

    //交换元素
    private void exchange(int i, int j) {
        E temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    //插入一个元素
    public void insert(E element) {
        elements[++n] = element;//尾部插入，先扩容
        swim(n);//上浮，使堆有序
    }

    //【上浮算法】（比较当前元素 a[k] 与父结点 a[k/2] 元素大小）
    private void swim(int k) {
        //通过循环不断比较当前结点的父结点和当前结点大小
        while (k > 1) {//最后一次是根结点比较，2/2=1
            if (isLess(k / 2, k)) {
                exchange(k / 2, k);
            }
            k /= 2;//更新为父结点位置
        }
    }

    //删除最大元素（即根结点--首个元素）
    public E deleteMax() {
        E max = elements[1];//最大元素即首个元素
        //删除最大元素
        exchange(1, n);//交换最大元素和最大索引初元素
        elements[n--] = null;//删除最大元素，且元素个数减1

        sink(1);//剩余元素排序（从新根结点开始下沉比较子结点）
        return max;
    }

    //【下沉算法】（比较当前元素与两个子结点元素 a[2k] 和 a[2k+1] 大小）
    private void sink(int k) {
        //通过循环不断比较当前结点的父结点和当前结点大小
        while (2 * k <= n) {//最底层即末尾元素
            //1. 获取当前结点的较大子结点
            int maxIndex;
            if (2 * k + 1 <= n) {//1.1 若有右子结点（在左子结点后）
                if (isLess(2 * k, 2 * k + 1)) {//比较左右子结点
                    maxIndex = 2 * k + 1;
                } else {
                    maxIndex = 2 * k;
                }
            } else {//1.2 没有右子结点，则左子结点为较大
                maxIndex = 2 * k;
            }

            //2. 比较当前结点和较大子结点
            if (isLess(maxIndex, k)) {
                break;//若当前大，不用交换，结束while
            }

            //3. 否则，交换当前结点和较大子结点
            exchange(k, maxIndex);

            k = maxIndex;//更新当前元素的索引
        }
    }

}
