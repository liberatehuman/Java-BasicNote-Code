package my.algorithms.Test;

/* 【约瑟夫问题】（用循环链表解决）
 *
 *  41 人坐一圈
 *      - 从 1 报数，依次向后，报数为 3 的人自杀退圈
 *      - 下一个人再从 1 开始报数，以此类推...不断循环
 *      - 求出最后退出的那个人的编号：31
 *
 *      最后只剩 16 和 31 两个数（轮到 16 应该自杀，但约瑟夫和他的同伴都想存活）
 * */
public class Linear08_JoesphTest {
    public static void main(String[] args) {

        Node<Integer> first = null;//首结点

        //1.构建循环链表
        Node<Integer> pre = null;//当前的前一结点【仅创建链表用】

        for (int i = 1; i <= 41; i++) {
            if (i == 1) {//若是第一个结点
                first = new Node<>(i, null);//初始化首结点
                pre = first;
                continue;
            }
            //若不是第一个结点
            Node newNode = new Node(i, null);//（创建结点）
            pre.next = newNode;//（形成链表）
            pre = newNode;

            if (i == 41) {//当到达尾部
                pre.next = first;//首尾相连【形成循环链表】
            }
        }

        //2. 模拟报数自杀
        int count = 0;//计数器
        Node<Integer> node = first;//从第一个开始
        Node<Integer> before = null;//自杀者前一结点

        while (node != node.next) {//终止条件：尾结点指向自己（自环）
            count++;//报数
            if (count == 3) {//报到 3 自杀
                before.next = node.next;//删除自杀结点
                System.out.print(node.item + ",");//打印自杀者
                count = 0;//计数清零
                node = node.next;//当前结点后移
            } else {
                before = node;//当前结点变为前一结点
                node = node.next;//当前结点后移
            }
        }
        System.out.println(node.item);//最后剩下的元素
    }

    private static class Node<E> {//本类其他方法要调用，静态
        private E item;
        private Node next;

        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
