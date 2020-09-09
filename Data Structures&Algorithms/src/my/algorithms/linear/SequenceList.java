package my.algorithms.linear;

/*【线性表】：顺序表（数组）
 * */
public class SequenceList<T> {

    private T[] elements;//存储元素的数组
    private int n;//当前顺序表元素个数

    //构造方法：创建一个指定容量的线性表
    public SequenceList(int capacity) {
        elements = (T[]) new Object[capacity];//初始化数组（直接T[]报错，强转即可）
        n = 0;//初始化长度
    }

    //清空元素
    public void clear() {
        n = 0;
    }

    //判断线性表是否为空
    public boolean isEmpty() {
        return n == 0;//无需if
    }

    //获取线性表个数
    public int length() {
        return n;
    }

    //获取指定位置的元素
    public T get(int index) {
        return elements[index];
    }

    //插入新元素（末尾）
    public void insert(T element) {
        elements[n++] = element;
    }

    //指定位置插入元素
    public void insert(int index, T element) {
        for (int i = index; i < n + 1; i++) {//先把index及其后面元素后移一位
            elements[i + 1] = elements[i];
        }
        elements[index] = element;//插入新元素
    }

    //移除指定位置元素
    public T remove(int index) {
        T t = elements[index];
        for (int i = index; i < n - 1; i++) {
            elements[i] = elements[i + 1];
        }
        n--;//元素个数减1
        return t;
    }

    //查找某元素第一次出现的位置
    public int indexOf(T element) {
        for (int i = 0; i < n; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
