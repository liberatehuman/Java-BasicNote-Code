package my.algorithms.Test;

import my.algorithms.sort.Selection;

import java.util.Arrays;

public class Sort03_SelectionTest {
    public static void main(String[] args) {

        Integer[] array = {6, 0, 2, 1, -1, 5};

        Selection.sort(array);

        System.out.println(Arrays.toString(array));

    }
}
