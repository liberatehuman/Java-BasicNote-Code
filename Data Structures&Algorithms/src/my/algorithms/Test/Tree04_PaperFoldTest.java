package my.algorithms.Test;

/* 【案例】：折纸问题
 *
 *      给定一个输入参数 N ，代表下边向上方连续对折 N 次，请从上到下打印所有折痕的方向
 *           例如：N=1，打印 down ；N=2，打印 down down up
 *
 * 【分析】：
 *  将第一次折痕视为根结点，那第二次的下折痕就是其左子结点，而第二次的上折痕就是其右子结点
 *  这样就可以用树型数据结构来描述对折后产生的折痕：
 *      - 根结点为下折痕
 *      - 每个结点的左子结点为下折痕
 *      - 每个结点的右子结点为上折痕
 * */

import my.algorithms.linear.Queue;

public class Tree04_PaperFoldTest {

    public static void main(String[] args) {
        Node tree = createTree(3);
        printTree(tree);
    }

    //构建深度为 n 的树（结点为折痕）
    private static Node<String> createTree(int n) {
        Node<String> root = null;
        for (int i = 1; i <= n; i++) {//每次对折都会产生新的折痕（左右叶子结点）
            if (i == 1) {//1. 第一次对折，下折痕
                root = new Node<>("down", null, null);
                continue;//结束本次循环
            }
            //2. 不是第一次对折，就要找到叶子结点，为其添加子结点（利用层序遍历）
            Queue<Node> queue = new Queue<>();
            queue.enqueue(root);
            while (!queue.isEmpty()) {
                Node<String> node = queue.dequeue();//最好声明存储元素类型
                if (node.left != null) {
                    queue.enqueue(node.left);
                }
                if (node.right != null) {
                    queue.enqueue(node.right);
                }
                //若该结点左右子结点都为空，分别创建 down 和 up 左右子结点
                if (node.left == null && node.right == null) {
                    node.left = new Node<>("down", null, null);
                    node.right = new Node<>("up", null, null);
                }
            }
        }
        return root;
    }

    //中序遍历打印所有结点（从上到下查看纸的折痕）
    private static void printTree(Node<String> root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {//递归打印左子树所有结点
            printTree(root.left);
        }
        System.out.print(root.item + "  ");//打印当前结点
        if (root.right != null) {//递归打印右子树所有结点
            printTree(root.right);
        }

    }

    private static class Node<E> {//本类其他方法要调用，静态
        public E item;
        public Node left;
        public Node right;

        public Node(E item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }

}
