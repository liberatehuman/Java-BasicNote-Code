package my.algorithms.Test;

/* 【快慢指针】：3. 单链表环入口
 *
 *      设置临时指针，若有环，则指向首结点
 *      当慢指针与临时指针相遇，所处位置即环入口结点
 * */
public class Linear07_getLoopEntranceTest {
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

        System.out.println(getLoopEntrance(node1).item);
    }

    public static Node getLoopEntrance(Node<String> first) {
        Node<String> slow = first;
        Node<String> fast = first;
        Node<String> temp = null;//临时指针，先不指向任何

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast.equals(slow)) {//若有环
                temp = first;//临时指针指向首结点
                continue;//即可跳出本次while循环
            }

            if (temp != null) {
                temp = temp.next;
                if (temp.equals(slow)) {//当临时指针和慢指针重合，所处结点即入口
                    break;//结束
                }
            }
        }
        return temp;
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
