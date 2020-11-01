package my.algorithms.Test;

import my.algorithms.priority.MaxPriorityQueue;

public class Priority01_MaxPriorityQueueTest {
    public static void main(String[] args) {

        MaxPriorityQueue<String> maxPriorityQueue = new MaxPriorityQueue<>(10);
        maxPriorityQueue.insert("A");
        maxPriorityQueue.insert("B");
        maxPriorityQueue.insert("C");
        maxPriorityQueue.insert("D");
        maxPriorityQueue.insert("F");
        maxPriorityQueue.insert("E");
        maxPriorityQueue.insert("G");

        String max;
        while ((max = maxPriorityQueue.deleteMax()) != null) {
            System.out.print(max + " ");
        }
    }
}
