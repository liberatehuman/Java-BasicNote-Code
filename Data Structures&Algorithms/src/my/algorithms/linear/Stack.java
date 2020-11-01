package my.algorithms.linear;

/* 【线性表】：3 栈（物理结构用链表实现）
 *
 *  案例：
 *      1.括号匹配问题
 *      2.逆波兰表达式
 * */

import java.util.Iterator;

public class Stack<E> implements Iterable<E> {

    private Node head;//唯一的口
    private int n;

    public Stack() {
        head = new Node(null, null);
        n = 0;
    }

    //判断是否为空
    public boolean isEmpty() {
        return n == 0;
    }

    //返回元素个数
    public int size() {
        return n;
    }

    //压栈（指定元素入栈）
    public void push(E item) {
        Node oldFirst = head.next;
        Node newNode = new Node(item, oldFirst);//入栈元素总是在最前
        head.next = newNode;//（总在头结点后）
        n++;
    }

    //弹栈（返回出栈元素--首个元素）
    public E pop() {
        if (isEmpty()) {//安全性校验，防止NPE
            return null;
        }
        Node oldFirst = head.next;
        head.next = oldFirst.next;//头结点指向出栈元素的后个元素
        n--;
        return oldFirst.item;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        private Node node = head;//直接赋值，就不用再写构造方法了

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
