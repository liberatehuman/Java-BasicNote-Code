package my.algorithms.Test;

import my.algorithms.linear.Queue;

public class Linear12_QueueTest {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        for (Integer integer : queue) {
            System.out.println(integer);
        }
        System.out.println("==========");

        System.out.println("取出元素："+queue.dequeue());

        System.out.println("剩余原始个数："+queue.size());
    }
}
