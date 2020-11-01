package my.algorithms.linear;

/*【线性表】：2 链表 -- 单向链表
 * */

import java.util.Iterator;

public class SinglyLinkedList<E> implements Iterable<E> {

    private Node head;//头结点
    private int n;//结点个数【头结点不计入】

    //【结点】内部类
    private class Node {//链表类已经使用泛型，这里不用，否则后续方法里创建结点都需要声明泛型
        public E item;//信息部分
        public Node next;//指向下一结点

        //构造方法
        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    //构造方法
    public SinglyLinkedList() {
        head = new Node(null, null);//创建头结点
        n = 0;//（头结点其实是索引0的元素）
    }

    //清空
    public void clear() {
        head.next = null;//让头结点指向空
        head.item = null;//头结点信息置空
        n = 0;
    }

    //判断是否为空
    public boolean isEmpty() {
        return n == 0;
    }

    //获取元素个数
    public int length() {
        return n;
    }

    //获取指定索引的元素
    public E get(int index) {
        Node node = head.next;//头结点不计入
        for (int i = 0; i < index; i++) {//从第一个结点开始找
            node = node.next;
        }
        return node.item;
    }

    //插入一个指定元素（默认尾部）
    public void insert(E item) {
        Node node = head;
        while (node.next != null) {//1. 找到最后一个结点
            node = node.next;
        }
        Node newNode = new Node(item, null);//2. 创建待插新结点，指向空
        node.next = newNode;//3. 当前线性表尾部指向新结点
        n++;//元素个数+1
    }

    //指定位置插入一个元素
    public void insert(int index, E item) {
        Node pre = head;
        for (int i = 0; i <= index - 1; i++) {//找到要插入位置的前一个结点
            pre = pre.next;
        }
        Node current = pre.next;//当前索引结点
        Node newNode = new Node(item, current);//创建待插新结点，指向当前结点
        pre.next = newNode;//前个结点指向新结点
        n++;
    }

    //返回指定元素首次出现的索引
    public int indexOf(E item) {
        Node node = head;//头指针开始找（可能元素值是null）
        for (int i = 0; node.next != null; i++) {
            node = node.next;
            if (node.item == item) {
                return i;
            }
        }
        return -1;
    }

    //删除指定位置元素并返回
    public E remove(int index) {
        Node pre = head;
        for (int i = 0; i <= index - 1; i++) {//找到待删前一结点
            pre = pre.next;
        }
        Node current = pre.next;//待删结点
        pre.next = current.next;//前一结点指向待删结点下一结点
        n--;
        return current.item;
    }

    //实现foreach遍历
    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        private Node node;

        //构造方法
        public Itr() {
            this.node = head;
        }

        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public E next() {
            node = node.next;//【更新结点】
            return node.item;//若直接返回 node.next.item，每次遍历都是初始node(head)的下一个
        }
    }

    //【*** 反转 ***】（重点）：头结点不断指向最后结点
    public void reverse() {
        if (isEmpty()) {
            return;
        }
        reverse(head.next);
    }

    //【递归反转】返回前一结点
    private Node reverse(Node current) {//当前遍历结点
        if (current.next == null) {//若已经是最后结点（最后是(current.next).next）
            head.next = current;//头结点应指向当前结点
            return current;
        }
        Node pre = reverse(current.next);//返回前一结点，递归反转（前一结点应该变为后一结点）
        //pre其实是head新指向的结点
        pre.next = current;//current才是前一个结点
        current.next = null;
        return current;
    }

}
