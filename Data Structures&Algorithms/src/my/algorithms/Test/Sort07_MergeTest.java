package my.algorithms.Test;

import my.algorithms.sort.Merge;

import java.util.Arrays;

public class Sort07_MergeTest {
    public static void main(String[] args) {

        Integer[] array = {6, 0, 2, 1, -1, 5};

        Merge.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
