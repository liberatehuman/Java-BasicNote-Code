package my.algorithms.Test;

import my.algorithms.tree.BinaryTree;

public class Tree01_BinaryTreeTest {
    public static void main(String[] args) {

        BinaryTree<Integer, String> binaryTree = new BinaryTree<>();

        binaryTree.put(1, "小王");
        binaryTree.put(2, "小明");
        binaryTree.put(3, "小红");

        binaryTree.put(3, "小东");

        System.out.println("键为 1 的值：" + binaryTree.get(1));
        System.out.println("键为 2 的值：" + binaryTree.get(2));
        System.out.println("键为 3 的值：" + binaryTree.get(3));

        binaryTree.delete(1);

        System.out.println("剩余元素个数：" + binaryTree.size());

        System.out.println("键为 1 的值：" + binaryTree.get(1));
        System.out.println("键为 2 的值：" + binaryTree.get(2));
        System.out.println("键为 3 的值：" + binaryTree.get(3));

        System.out.println("最小键：" + binaryTree.minKey());
        System.out.println("最大键：" + binaryTree.maxKey());
    }
}
