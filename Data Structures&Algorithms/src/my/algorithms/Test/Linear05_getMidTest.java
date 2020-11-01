package my.algorithms.Test;

/* 【快慢指针】：1. 中间元素问题
 *
 *  （定义两个指针，移动步长一块一慢，以此制造差值，可以利用差值找到相应结点）
 *
 *      一般快指针的移动步长为慢指针的 2 倍（当快指针走到结尾，慢指针所在即中间元素）
 * */
public class Linear05_getMidTest {
    public static void main(String[] args) {

        Node<String> node1 = new Node<>("aa", null);
        Node<String> node2 = new Node<>("bb", null);
        Node<String> node3 = new Node<>("cc", null);
        Node<String> node4 = new Node<>("dd", null);
        Node<String> node5 = new Node<>("ee", null);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        String mid = getMid(node1);
        System.out.println(mid);
    }

    public static String getMid(Node<String> first) {
        Node<String> slow = first;//快指针 （声明泛型）
        Node<String> fast = first;//慢指针
        while (fast != null && fast.next != null) {//快指针走完即终止
            fast = fast.next.next;//快指针移动两个结点
            slow = slow.next;//慢指针移动一个结点
        }
        return slow.item;
    }

    private static class Node<E> {//静态，否则不能创建对象
        private E item;
        private Node next;

        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
