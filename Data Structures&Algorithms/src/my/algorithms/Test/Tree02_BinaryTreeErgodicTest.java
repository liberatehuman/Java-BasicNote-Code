package my.algorithms.Test;

import my.algorithms.linear.Queue;
import my.algorithms.tree.BinaryTree;

public class Tree02_BinaryTreeErgodicTest {
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

        //测试前序遍历
        System.out.println("===前序遍历===");
        Queue<String> keys1 = binaryTree.preErgodic();
        for (String key : keys1) {
            System.out.println(key + "=" + binaryTree.get(key));
        }

        //测试中序遍历
        System.out.println("===中序遍历===");
        Queue<String> keys2 = binaryTree.midErgodic();
        for (String key : keys2) {
            System.out.println(key + "=" + binaryTree.get(key));
        }

        //测试后序遍历
        System.out.println("===后序遍历===");
        Queue<String> keys3 = binaryTree.afterErgodic();
        for (String key : keys3) {
            System.out.println(key + "=" + binaryTree.get(key));
        }

        //测试层序遍历
        System.out.println("===层序遍历===");
        Queue<String> keys4 = binaryTree.layerErgodic();
        for (String key : keys4) {
            System.out.println(key + "=" + binaryTree.get(key));
        }
    }
}
