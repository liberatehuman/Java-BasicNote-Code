package my.algorithms.linear;

/*【线性表】：2 链表 -- 双向链表
 * */

import java.util.Iterator;

public class DoublyLinkedList<E> implements Iterable<E> {

    private Node head;
    private Node last;//尾结点
    private int n;

    private class Node {
        public Node pre;//头指针
        public E item;
        public Node next;

        public Node(Node pre, E item, Node next) {
            this.pre = pre;
            this.item = item;
            this.next = next;
        }
    }

    public DoublyLinkedList() {
        head = new Node(null, null, null);
        last = null;//尾结点置空
        n = 0;
    }

    //清空
    public void clear() {
        head.pre = null;
        head.next = null;
        head.item = null;
        last = null;
        n = 0;
    }

    //判断是否为空
    public boolean isEmpty() {
        return n == 0;
    }

    //返回元素个数
    public int length() {
        return n;
    }

    //获取第一个元素
    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.next.item;//不为空，则返回（不能放入if，否则死循环）
    }

    //获取最后一个元素
    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return last.item;//同上
    }

    //插入一个指定元素（尾部）【注意双向】
    public void insert(E item) {
        if (isEmpty()) {//a. 若链表没有元素
            Node newNode = new Node(head, item, null);//创建时，头指针指向头结点
            head.next = newNode;//头结点指向尾结点
            last = newNode;
        } else {//b. 链表有元素
            Node oldLast = last;//暂存原尾结点
            Node newNode = new Node(oldLast, item, null);//创建时，头指针指向原尾结点
            oldLast.next = newNode;//原尾结点指向新结点
            last = newNode;
        }
        n++;
    }

    //指定位置插入一个元素【注意双向】
    public void insert(int index, E item) {
        Node pre = head;
        for (int i = 0; i < index; i++) {//找到索引前一结点
            pre = pre.next;
        }
        Node current = pre.next;//索引处原结点
        Node newNode = new Node(pre, item, current);//头指向前一结点，尾指向索引初原结点
        pre.next = newNode;//前一结点尾指向新结点
        current.pre = newNode;//原结点头指向新结点
        n++;
    }

    //获取指定索引的元素值
    public E get(int index) {
        Node pre = head.next;//头结点不计入
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        return pre.item;
    }

    //返回指定元素首次出现的索引
    public int indexOf(E item) {
        Node pre = head;//头指针开始找
        for (int i = 0; pre.next != null; i++) {
            pre = pre.next;
            if (pre.next.equals(item)) {//判断是否相等
                return i;
            }
        }
        return -1;
    }

    //删除指定位置元素并返回【*** 测试不能删最后一个元素，抛 NPE *+*】
    public E remove(int index) {
        Node pre = head;
        for (int i = 0; i < index; i++) {//找到前一结点
            pre = pre.next;
        }
        Node current = pre.next;//当前位置结点
        Node nextNode = current.next;//后一结点
        pre.next = nextNode;
        nextNode.pre = pre;
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
}
