package my.algorithms.Test;

import my.algorithms.priority.IndexPriorityQueue;


public class Priority03_IndexPriorityQueueTest {
    public static void main(String[] args) {

        IndexPriorityQueue<String> indexPriorityQueue = new IndexPriorityQueue<>(20);
        indexPriorityQueue.insert(1, "A");
        indexPriorityQueue.insert(2, "B");
        indexPriorityQueue.insert(3, "C");

        System.out.println("最小元素索引：" + indexPriorityQueue.getMinIndex());

        indexPriorityQueue.change(1, "D");

        while (!indexPriorityQueue.isEmpty()) {
            int index = indexPriorityQueue.deleteMin();//被删的最小元素索引
            System.out.print(index + " ");
        }

    }
}
