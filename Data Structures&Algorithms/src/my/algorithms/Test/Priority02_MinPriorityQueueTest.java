package my.algorithms.Test;

import my.algorithms.priority.MinPriorityQueue;

public class Priority02_MinPriorityQueueTest {
    public static void main(String[] args) {

        MinPriorityQueue<String> minPriorityQueue = new MinPriorityQueue<>(10);
        minPriorityQueue.insert("A");
        minPriorityQueue.insert("B");
        minPriorityQueue.insert("C");
        minPriorityQueue.insert("D");
        minPriorityQueue.insert("E");
        minPriorityQueue.insert("F");
        minPriorityQueue.insert("G");

        String min;
        while ((min = minPriorityQueue.deleteMin()) != null) {
            System.out.print(min + " ");
        }
    }
}
