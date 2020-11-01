package my.algorithms.priority;

/* 【最小优先队列】：略微调整堆的规则实现
 *      - 最【小】元素在堆顶
 *      - 每个结点数据【≤】两个子结点数据
 * */
public class MinPriorityQueue<E extends Comparable<E>> {

    private E[] elements;
    private int n;

    public MinPriorityQueue(int capacity) {
        this.elements = (E[]) new Comparable[capacity + 1];
        this.n = 0;
    }

    public void insert(E element) {
        elements[++n] = element;
        swim(n);
    }

    private void swim(int k) {
        while (k > 1) {
            if (isLess(k, k / 2)) {
                exchange(k, k / 2);
            }
            k /= 2;
        }
    }

    public E deleteMin() {
        E min = elements[1];
        exchange(1, n);
        elements[n] = null;
        n--;
        sink(1);
        return min;
    }

    private void sink(int k) {
        while (2 * k <= n) {
            int minIndex;
            if (2 * k + 1 <= n) {
                if (isLess(2 * k, 2 * k + 1)) {
                    minIndex = 2 * k;
                } else {
                    minIndex = 2 * k + 1;
                }
            } else {
                minIndex = 2 * k;
            }

            if (isLess(k, minIndex)) {
                break;
            }
            exchange(k, minIndex);
            k = minIndex;
        }

    }

    private boolean isLess(int i, int j) {
        return elements[i].compareTo(elements[j]) < 0;
    }

    private void exchange(int i, int j) {
        E temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }
}
