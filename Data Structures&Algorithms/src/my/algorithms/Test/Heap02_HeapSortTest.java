package my.algorithms.Test;

import my.algorithms.heap.HeapSort;

import java.util.Arrays;

public class Heap02_HeapSortTest {
    public static void main(String[] args) {

        String[] array = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

        HeapSort.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
