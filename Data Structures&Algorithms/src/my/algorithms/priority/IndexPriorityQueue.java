package my.algorithms.priority;

public class IndexPriorityQueue<E extends Comparable<E>> {

    private E[] elements;//存储真正数据的数组
    private int[] pq;//存储数据索引的数组（堆调整后的顺序）
    private int[] qp;// qp 的索引（与元素数组索引一致）<=> pq 的值；qp 的值 <=> qp 的索引
    private int n;

    public IndexPriorityQueue(int capacity) {
        this.elements = (E[]) new Comparable[capacity + 1];
        this.pq = new int[capacity + 1];
        this.qp = new int[capacity + 1];
        this.n = 0;

        for (int i = 0; i < qp.length; i++) {//初始队列无元素，令全为-1
            qp[i] = -1;
        }
    }

    private boolean isLess(int i, int j) {
        return elements[pq[i]].compareTo(elements[pq[j]]) < 0;//通过pq存储的索引，找到数组中的元素
    }

    //交换两个索引处的元素（只动pq和qp，元素数组不动）
    private void exchange(int i, int j) {
        //交换 pq 中的值（索引）
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
        //更新 qp 中的值
        qp[pq[i]] = i;
        qp[pq[j]] = j;
    }

    //判断 k 对应的元素是否存在
    public boolean isContain(int k) {
        return qp[k] != -1;//qp 和元素数组索引一致，直接根据 qp 判断即可
    }

    //获取最小元素的索引
    public int getMinIndex() {
        return pq[1];//pq存的就是索引
    }

    //指定索引处插入元素（即插入元素同时关联索引）
    public void insert(int index, E element) {
        if (isContain(index)) {//若索引已存在，则不允许插入
            throw new RuntimeException("索引已存在，不允许插入");
        }
        n++;
        //分别对元素数组、pq、qp进行更新
        elements[index] = element;//放入元素
        pq[n] = index;//存储索引（插入元素索引在pq中位于最后）
        qp[index] = n;//更新qp

        swim(n);//调整堆
    }

    //上浮（主要针对pq）
    private void swim(int k) {
        while (k > 1) {
            if (isLess(k, k / 2)) {
                exchange(k, k / 2);
            }
            k /= 2;
        }
    }

    //删除队列最小元素，并返回该元素关联的索引
    public int deleteMin() {
        int minIndex = pq[1];
        exchange(1, n);
        //分别对元素数组、qp、pq进行删除
        elements[pq[n]] = null;
        qp[pq[n]] = -1;//qp和元素数组索引一致
        pq[n] = -1;
        n--;
        sink(1);
        return minIndex;
    }

    //删除索引 index 关联的元素（类似 deleteMin）
    public void delete(int index) {
        //获取pq中对应值
        int k = qp[index];//被删索引是针对qp，即元素数组的索引
        exchange(k, n);
        //分别对 qp、pq、元素数组进行删除
        qp[pq[n]] = -1;
        pq[n] = -1;
        elements[k] = null;
        n--;
        //调整堆（因为不是删除最小元素，所以上浮和下沉都需要，但无先后要求）
        sink(k);
        swim(k);
    }

    //下沉（主要针对pq）
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

    //修改索引 index 处的元素为 element
    public void change(int index, E element) {
        elements[index] = element;
        int k = qp[index];//通过qp找到索引（在pq中）
        //调整堆
        swim(k);
        sink(k);
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

}
