package my.algorithms.linear;

import java.util.Iterator;

public class Queue<E> implements Iterable<E> {

    public Node head;//入口
    public Node last;//出口
    public int n;

    public Queue() {
        this.head = new Node(null, null);
        this.last = null;//还没有尾结点
        this.n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    //向队列插入元素
    public void enqueue(E item) {//尾插入
        if (last == null) {
            last = new Node(item, null);
            head.next = last;
        } else {
            Node oldLast = last;
            last = new Node(item, null);
            oldLast.next = last;
        }
        n++;
    }

    //从队列取出元素
    public E dequeue() {//从头部取
        if (isEmpty()) {
            return null;
        }
        Node oldFirst = head.next;
        head.next = oldFirst.next;
        n--;
        if (isEmpty()) {//删完则为空，需要重置last为空
            last = null;
        }
        return oldFirst.item;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {

        public Node node = head;

        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public E next() {
            node = node.next;
            return node.item;
        }
    }


    private class Node {
        public E item;
        public Node next;

        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }

    }
}
