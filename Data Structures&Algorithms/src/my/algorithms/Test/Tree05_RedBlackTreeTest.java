package my.algorithms.Test;

import my.algorithms.tree.RedBlackTree;

public class Tree05_RedBlackTreeTest {
    public static void main(String[] args) {

        RedBlackTree<Integer, String> redBlackTree = new RedBlackTree<>();
        redBlackTree.put(1, "娜扎");
        redBlackTree.put(2, "热巴");
        redBlackTree.put(3, "扎哈");

        for (int i = 1; i <= 3; i++) {
            System.out.println(redBlackTree.get(i));
        }

    }
}
