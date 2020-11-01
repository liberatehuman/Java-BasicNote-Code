package my.algorithms.symbol;

import java.util.Iterator;

public class SymbolTable<K, V> {

    private Node head;
    private int n;

    private class Node {
        public K key;//键
        public V value;//值
        public Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public SymbolTable() {
        this.head = new Node(null, null, null);
        this.n = 0;
    }

    //获取元素个数
    public int size() {
        return n;
    }

    //获取（根据键找值）
    public V get(K key) {
        Node node = head;
        while (node.next != null) {//遍历
            node = node.next;
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    //插入键值对
    public void put(K key, V value) {
        Node node = head;
        //1.若该键已存在
        while (node.next != null) {//遍历
            node = node.next;
            if (node.key.equals(key)) {//若已存在（不需要n++）
                node.value = value;
                return;
            }
        }
        //2.若没有，则插在头部
        Node oldFirst = head.next;
        Node newNode = new Node(key, value, oldFirst);
        head.next = newNode;
        n++;
    }

    //删除指定键的键值对
    public void delete(K key) {
        Node node = head;
        while (node.next != null) {//遍历
            if (node.next.key.equals(key)) {//若找到
                node.next = node.next.next;//删除
                n--;
                return;
            }
            node = node.next;//没找到，继续寻找
        }
    }


}
