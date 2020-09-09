package my.algorithms.Test;

import my.algorithms.sort.Insertion;

import java.util.Arrays;

public class Sort04_InsertionTest {
    public static void main(String[] args) {

        Integer[] array = {1, 3, -1, 6, 0, 1};

        Insertion.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
