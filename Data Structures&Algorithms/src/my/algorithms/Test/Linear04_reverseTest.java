package my.algorithms.Test;

import my.algorithms.linear.SinglyLinkedList;

public class Linear04_reverseTest {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(3);
        singlyLinkedList.insert(4);
        singlyLinkedList.insert(5);

        for (Integer integer : singlyLinkedList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        singlyLinkedList.reverse();

        for (Integer integer : singlyLinkedList) {
            System.out.print(integer + " ");
        }
    }
}
