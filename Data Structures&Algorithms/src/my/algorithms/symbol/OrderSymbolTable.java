package my.algorithms.symbol;

public class OrderSymbolTable<K extends Comparable<K>, V> {

    private Node head;
    private int n;

    private class Node {
        public K key;
        public V value;
        public Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public OrderSymbolTable() {
        this.head = new Node(null, null, null);
        this.n = 0;
    }

    //【插入键值对】（有序）
    public void put(K key, V value) {
        Node current = head.next;//当前结点
        Node pre = head;//前一结点

        //1.若该键 > 当前键，继续寻找
        while (current != null && key.compareTo(current.key) > 0) {
            pre = current;
            current = current.next;
        }

        //2.若该键 = 当前键，替换值
        if (current != null && key.compareTo(current.key) == 0) {
            current.value = value;
            return;//结束
        }

        //3.若都不满足，插在当前键之前（当前键 > 该键）
        Node newNode = new Node(key, value, current);
        pre.next = newNode;
        n++;
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
