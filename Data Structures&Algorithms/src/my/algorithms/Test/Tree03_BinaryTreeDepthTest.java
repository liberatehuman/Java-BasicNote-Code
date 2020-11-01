package my.algorithms.Test;

import my.algorithms.tree.BinaryTree;

public class Tree03_BinaryTreeDepthTest {
    public static void main(String[] args) {

        BinaryTree<String, String> binaryTree = new BinaryTree<>();
        binaryTree.put("E", "5");
        binaryTree.put("B", "2");
        binaryTree.put("G", "7");
        binaryTree.put("A", "1");
        binaryTree.put("D", "4");
        binaryTree.put("F", "6");
        binaryTree.put("H", "8");
        binaryTree.put("C", "3");

        System.out.println("该树的最大深度：" + binaryTree.depth());//4
    }
}
