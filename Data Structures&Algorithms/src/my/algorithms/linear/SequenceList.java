package my.algorithms.linear;

/* 【线性表】：1 顺序表（数组实现），如 ArrayList
 *
 * 【缺点】：增删慢
 *      get(i)：
 *          无论数据元素量N有多大，时间复杂度为O(1)
 *      insert(int i, T t)：
 *          每次插入，都需要把i位置后面的元素移动一次，随着元素数量↑，移动的元素个数↑，时间复杂度O(n)
 *      remove(int i)：
 *          每次删除，都需要把i位置后面的元素移动一次，随着数据量↑,移动的元素个数↑，时间复杂度O(n)
 *
 *  顺序表的底层由数组实现，数组长度是固定的，在操作过程中涉及到容器扩容操作。
 *      - 这样会导致顺序表在使用过程中的时间复杂度非线性变化（在某些需要扩容的结点处，耗时会突增）
 *      - 元素越多，这个问题越明显
 * */

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T> {

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
        if (n == elements.length) {//若已装满，需要先扩容
            resize(n * 2);//扩为 2 倍
        }
        elements[n++] = element;
    }

    //指定位置插入元素
    public void insert(int index, T element) {
        if (n == elements.length) {//注意扩容
            resize(n * 2);
        }
        for (int i = index; i < n + 1; i++) {//把index及其后面元素后移一位【注意 n+1 扩容】
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

        if (n > 0 && n < (elements.length / 4)) {//若移除后长度小于容量的1/4，缩容到1/2
            resize(elements.length / 2);
        }

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

    //【实现可foreach遍历】
    @Override
    public Iterator<T> iterator() {
        return new Itr();//要返回一个Iterator<T>对象，使用实现Iterator内部类
    }

    //实现 Iterator 的内部类
    private class Itr implements Iterator {
        private int cursor;//指针

        //构造方法
        public Itr() {
            cursor = 0;//指针一开始指向头元素
        }

        @Override
        public boolean hasNext() {//判断是否有下一个元素
            return cursor < n;
        }

        @Override
        public Object next() {//返回下一个元素
            return elements[cursor++];//获取完，指针后移一位
        }
    }

    //【可变容量】：插入（扩容2倍）、移除（缩容1/2）
    public void resize(int newSize) {
        T[] temp = elements;//临时数组，保存原数组内容
        elements = (T[]) new Object[newSize];//变为新数组
        for (int i = 0; i < n; i++) {
            elements[i] = temp[i];//原内容放入
        }
    }

    //获取容量
    public int getCapacity() {
        return elements.length;
    }


}
