package my.algorithms.priority;

/* 【最大优先队列】：由正常的堆实现
 *      - 最大元素在堆顶
 *      - 每个结点数据 ≥ 两个子结点数据
 * */
public class MaxPriorityQueue<E extends Comparable<E>> {

    private E[] elements;
    private int n;

    public MaxPriorityQueue(int capacity) {
        this.elements = (E[]) new Comparable[capacity + 1];
        this.n = 0;
    }

    public void insert(E element) {
        elements[++n] = element;
        swim(n);
    }

    private void swim(int k) {
        while (k > 1) {
            if (isLess(k / 2, k)) {
                exchange(k / 2, k);
            }
            k /= 2;
        }
    }

    public E deleteMax() {
        E max = elements[1];
        exchange(1, n);
        elements[n] = null;
        n--;
        sink(1);
        return max;
    }

    private void sink(int k) {
        while (2 * k <= n) {
            int maxIndex;
            if (2 * k + 1 <= n) {
                if (isLess(2 * k, 2 * k + 1)) {
                    maxIndex = 2 * k + 1;
                } else {
                    maxIndex = 2 * k;
                }
            } else {
                maxIndex = 2 * k;
            }
            if (isLess(maxIndex, k)) {
                break;
            }
            exchange(k, maxIndex);
            k = maxIndex;
        }
    }

    private void exchange(int i, int j) {
        E temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    private boolean isLess(int i, int j) {
        return elements[i].compareTo(elements[j]) < 0;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }
}
