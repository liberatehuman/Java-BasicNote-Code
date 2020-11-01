package my.algorithms.Test;

/* 【快慢指针】：2. 单链表有环问题
 *
 *      若快慢指针能够相遇，说明有环
 * */
public class Linear06_hasLoopTest {
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

        node5.next = node2;//制造环

        System.out.println(hasLoop(node1));
    }

    public static boolean hasLoop(Node<String> first) {
        Node<String> slow = first;
        Node<String> fast = first;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {//若快慢指针能相遇，即有环（也可用 equals，原理是==）
                return true;
            }
        }
        return false;
    }

    private static class Node<E> {
        private E item;
        private Node next;

        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
